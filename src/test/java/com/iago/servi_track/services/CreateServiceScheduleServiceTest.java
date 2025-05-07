package com.iago.servi_track.services;

import com.iago.servi_track.dto.ServiceCallScheduleDto;
import com.iago.servi_track.entities.Client;
import com.iago.servi_track.entities.ServiceCallSchedule;
import com.iago.servi_track.exceptions.ApiException;
import com.iago.servi_track.repositories.ClientRepository;
import com.iago.servi_track.repositories.ServiceScheduleRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CreateServiceScheduleServiceTest {

	@Mock
	private ServiceScheduleRepository repository;

	@Mock
	private ClientRepository clientRepository;

	@InjectMocks
	private CreateServiceScheduleService service;

	private ServiceCallScheduleDto dto;

	@BeforeEach
	void setup() {
		dto = new ServiceCallScheduleDto(
				LocalDate.now().plusDays(1),
				LocalTime.of(10, 30),
				"formatação e instalação de sistema operacional windows",
				"voke",
				"Rua A, 123",
				new BigDecimal("150.00"),
				LocalDate.now().plusDays(1)
		);
	}

	@Test
	void shouldCreateServiceCallSuccessfully() {
		when(repository.findByServiceScheduleDateAndServiceScheduleHour(any(), any())).thenReturn(Optional.empty());
		when(clientRepository.findByName("voke")).thenReturn(Optional.empty());

		ServiceCallSchedule savedEntity = new ServiceCallSchedule();
		savedEntity.setId(1L);

		when(repository.save(any())).thenReturn(savedEntity);

		ServiceCallSchedule result = service.execute(dto);

		assertNotNull(result);
		assertEquals(1L, result.getId());
		verify(clientRepository).save(any(Client.class));
		verify(repository).save(any(ServiceCallSchedule.class));
	}
	@Test
	void shouldThrowWhenServiceAlreadyScheduled() {
		when(repository.findByServiceScheduleDateAndServiceScheduleHour(any(), any()))
				.thenReturn(Optional.of(new ServiceCallSchedule()));

		ApiException ex = assertThrows(ApiException.class, () -> service.execute(dto));
		assertEquals("service already scheduled", ex.getMessage());
	}

	@Test
	void shouldThrowWhenDateIsToday() {
		dto = new ServiceCallScheduleDto(
				LocalDate.now(),
				LocalTime.of(10,30),
				"formatação e instalação de sistema operacional windows",
				"voke",
				"Rua A, 123",
				new BigDecimal("150.00"),
				LocalDate.now().plusDays(1)
		);

		when(repository.findByServiceScheduleDateAndServiceScheduleHour(any(), any())).thenReturn(Optional.empty());

		ApiException ex = assertThrows(ApiException.class, () -> service.execute(dto));
		assertEquals("Date must not be equal or before current date.", ex.getMessage());
	}

	@Test
	void shouldThrowWhenPaymentDateIsToday() {
		dto = new ServiceCallScheduleDto(
				LocalDate.now(),
				LocalTime.of(10,30),
				"formatação e instalação de sistema operacional windows",
				"voke",
				"Rua A, 123",
				new BigDecimal("150.00"),
				LocalDate.now()
		);

		when(repository.findByServiceScheduleDateAndServiceScheduleHour(any(), any())).thenReturn(Optional.empty());

		ApiException ex = assertThrows(ApiException.class, () -> service.execute(dto));
		assertEquals("Date must not be equal or before current date.", ex.getMessage());
	}

	@Test
	void shouldNotCreateNewClientIfExists() {
		Client existingClient = new Client();
		existingClient.setId(1L);
		existingClient.setName("voke");

		when(repository.findByServiceScheduleDateAndServiceScheduleHour(any(), any())).thenReturn(Optional.empty());
		when(clientRepository.findByName("voke")).thenReturn(Optional.of(existingClient));
		when(repository.save(any())).thenReturn(new ServiceCallSchedule());

		ServiceCallSchedule result = service.execute(dto);

		verify(clientRepository, never()).save(any(Client.class));
	}


	// Testes abaixo
}


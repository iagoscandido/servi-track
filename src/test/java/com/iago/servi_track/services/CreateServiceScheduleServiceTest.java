package com.iago.servi_track.services;

import com.iago.servi_track.dto.ServiceCallScheduleDto;
import com.iago.servi_track.entities.Client;
import com.iago.servi_track.entities.ServiceCallSchedule;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

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


	// Testes abaixo
}


package com.iago.servi_track.services;

import com.iago.servi_track.dto.ServiceCallScheduleDto;
import com.iago.servi_track.entities.Client;
import com.iago.servi_track.entities.ServiceCallSchedule;
import com.iago.servi_track.repositories.ClientRepository;
import com.iago.servi_track.repositories.ServiceScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateServiceScheduleService {
	private final ServiceScheduleRepository repository;
	private final ClientRepository clientRepository;

	public ServiceCallSchedule execute(ServiceCallScheduleDto dto) {
		Client client = new Client();

		if ((clientRepository.findByName(dto.clientName())).isEmpty()) {
			client.setName(dto.clientName().toLowerCase());
			clientRepository.save(client);
		}
		
		ServiceCallSchedule callSchedule = new ServiceCallSchedule();

		callSchedule.setServiceScheduleDate(dto.serviceScheduleDate());
		callSchedule.setServiceScheduleHour(dto.serviceScheduleHour());
		callSchedule.setServiceDescription(dto.serviceDescription());
		callSchedule.setClient(client);
		callSchedule.setAddress(dto.address());
		callSchedule.setServiceFee(dto.serviceFee());
		callSchedule.setPaymentDate(dto.paymentDate());

		ServiceCallSchedule entity = new ServiceCallSchedule();

		return repository.save(entity);
	}
}

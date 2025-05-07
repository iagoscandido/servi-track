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

		ServiceCallSchedule entity = new ServiceCallSchedule();

		entity.setServiceScheduleDate(dto.serviceScheduleDate());
		entity.setServiceScheduleHour(dto.serviceScheduleHour());
		entity.setServiceDescription(dto.serviceDescription());
		entity.setClient(client);
		entity.setAddress(dto.address());
		entity.setServiceFee(dto.serviceFee());
		entity.setPaymentDate(dto.paymentDate());

		return repository.save(entity);
	}
}

package com.iago.servi_track.repositories;

import com.iago.servi_track.entities.ServiceCallSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

@Repository
public interface ServiceScheduleRepository extends JpaRepository<ServiceCallSchedule, Long> {
	Optional<ServiceCallSchedule> findByServiceScheduleDateAndServiceScheduleHour(LocalDate serviceScheduleDate, LocalTime serviceScheduleTime);
}

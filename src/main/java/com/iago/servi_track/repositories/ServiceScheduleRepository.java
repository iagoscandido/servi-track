package com.iago.servi_track.repositories;

import com.iago.servi_track.entities.ServiceCallSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceScheduleRepository extends JpaRepository<ServiceCallSchedule, Long> {
}

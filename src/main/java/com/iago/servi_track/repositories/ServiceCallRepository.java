package com.iago.servi_track.repositories;

import com.iago.servi_track.entities.ServiceCall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceCallRepository extends JpaRepository<ServiceCall, Long> {
}

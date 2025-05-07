package com.iago.servi_track.repositories;

import com.iago.servi_track.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client  , Long> {
	Optional<Client> findByName(String name);
}

package com.iago.servi_track.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "requester")
public class Requester {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String name;
}

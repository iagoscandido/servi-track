package com.iago.servi_track.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "costs")
public class Cost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "description",nullable = false)
	private String description;
	@Column(name = "value", nullable = false)
	private BigDecimal value;
};

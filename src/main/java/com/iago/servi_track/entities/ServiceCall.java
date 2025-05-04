package com.iago.servi_track.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "serivce_call")
public class ServiceCall {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "date", nullable = false)
	private LocalDate serviceDate;
	@Column(name = "description", nullable = false)
	private String description;
	@Column(name = "client")
	private String client;
	@Column(name = "address", nullable = false)
	private String address;
	@Column(name = "duration_hours", nullable = false)
	private Integer durationHours;
	@Column(name = "expected_payment_date", nullable = false)
	private LocalDate expectedPaymentDate;
	@Column(name = "service_fee", nullable = false)
	private BigDecimal serviceFee;

//	@ManyToOne
//	@JoinColumn(name = "company_id")
//	private Company contractingCompany;
//
//	@ManyToOne
//	@JoinColumn(name = "requester_id")
//	private Requester requester;
//
//	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	private List<Cost> costs;

}
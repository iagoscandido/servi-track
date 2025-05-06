package com.iago.servi_track.entities;

import com.iago.servi_track.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "service_call_schedule")
public class ServiceCallSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "service_schedule_date", nullable = false)
	private LocalDate serviceScheduleDate;
	@Column(name = "service_schedule_hour", nullable = false)
	private LocalTime serviceScheduleHour;
	@Column(name = "description", nullable = false)
	private String serviceDescription;
	@Column(name = "address", nullable = false)
	private String address;
	@Column(name = "service_fee", nullable = false)
	private BigDecimal serviceFee;
	@Column(name = "payment_date", nullable = false)
	private LocalDate paymentDate;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	@Enumerated(EnumType.STRING)
	@Column(name = "payment_status", nullable = false)
	private PaymentStatus paymentStatus = PaymentStatus.PENDING;

	@CreatedDate
	@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDateTime createdAt;

	@LastModifiedDate
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
}
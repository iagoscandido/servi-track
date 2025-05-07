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
@Table(name = "service_call")
public class ServiceCall {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "date", nullable = false)
	private LocalDate serviceDate;
	@Column(name = "description", nullable = false)
	private String description;
	@Column(name = "address", nullable = false)
	private String address;
	@Column(name = "start_time", nullable = false)
	private LocalTime startTime;
	@Column(name = "end_time", nullable = false)
	private LocalTime endTime;
	@Column(name = "service_fee", nullable = false)
	private BigDecimal serviceFee;
	@Column(name = "expected_payment_date", nullable = false)
	private LocalDate expectedPaymentDate;
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
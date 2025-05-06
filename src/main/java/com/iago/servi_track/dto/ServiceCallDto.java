package com.iago.servi_track.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ServiceCallDto(
		String clientName,
		String description,
		String address,
		BigDecimal serviceFee,
		LocalDate expectedPaymentDate
) {}

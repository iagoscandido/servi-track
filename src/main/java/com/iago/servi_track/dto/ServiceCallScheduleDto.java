package com.iago.servi_track.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public record ServiceCallScheduleDto(
		LocalDate serviceScheduleDate,
		LocalTime serviceScheduleHour,
		String serviceDescription,
		String clientName,
		String address,
		BigDecimal serviceFee,
		LocalDate paymentDate
) {
}

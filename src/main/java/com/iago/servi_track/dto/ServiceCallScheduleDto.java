package com.iago.servi_track.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public record ServiceCallScheduleDto(
		LocalDate serviceScheduleDate,
		@JsonFormat(pattern = "HH:mm")
		LocalTime serviceScheduleHour,
		String serviceDescription,
		String clientName,
		String address,
		BigDecimal serviceFee,
		LocalDate paymentDate
) {
}

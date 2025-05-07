package com.iago.servi_track.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public record ServiceCallScheduleDto(
		@NotNull(message = "The service schedule date is required.")
		@Future(message = "The service schedule date must be in the future.")
		LocalDate serviceScheduleDate,
		@NotNull(message = "The service schedule time is required.")
		@JsonFormat(pattern = "HH:mm")
		LocalTime serviceScheduleHour,
		@NotBlank(message = "The service description is required.")
		@Size(min = 5, max = 255, message = "The service description must be between 5 and 255 characters.")
		String serviceDescription,
		@NotBlank(message = "The client name is required.")
		@Size(max = 100, message = "The client name must be at most 100 characters.")
		String clientName,
		@NotBlank(message = "The address is required.")
		@Size(min = 5, max = 255, message = "The address must be between 5 and 255 characters.")
		String address,
		@NotNull(message = "The service fee is required.")
		@DecimalMin(value = "0.0", inclusive = false, message = "The service fee must be greater than zero.")
		BigDecimal serviceFee,
		@NotNull(message = "The payment date is required.")
		@FutureOrPresent(message = "The payment date must not be in the past.")
		LocalDate paymentDate
) {
}

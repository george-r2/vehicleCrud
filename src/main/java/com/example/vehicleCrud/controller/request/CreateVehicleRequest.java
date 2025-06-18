package com.example.vehicleCrud.controller.request;

import java.math.BigDecimal;
import java.time.Year;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateVehicleRequest {

	@NotEmpty
	private String trademarkId;
	@NotEmpty
	private String model;
	@NotNull
	@Min(1980)
	@Max(2026)
	private Integer year;
	@NotNull
	private BigDecimal price;
}

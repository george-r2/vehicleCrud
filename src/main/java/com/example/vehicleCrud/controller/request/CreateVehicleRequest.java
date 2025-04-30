package com.example.vehicleCrud.controller.request;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CreateVehicleRequest {

	private String trademarkId;
	private String model;
	private Integer year;
	private BigDecimal price;
}

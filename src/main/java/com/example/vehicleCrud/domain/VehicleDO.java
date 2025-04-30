package com.example.vehicleCrud.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class VehicleDO {

	private String id;
	private String trademarkId;
	private String model;
	private Integer year;
	private BigDecimal price;
	private LocalDateTime ingressDate;
	private String status;

}

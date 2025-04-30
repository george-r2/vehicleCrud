package com.example.vehicleCrud.jpa.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehicle")
@Getter
@Setter
@NoArgsConstructor
public class VehicleEntity {

	@Id
	@UuidGenerator
	private String id;
	private String trademarkId;
	private String model;
	private Integer year;
	private BigDecimal price;
	private LocalDateTime ingressDate;
	private String status;
}

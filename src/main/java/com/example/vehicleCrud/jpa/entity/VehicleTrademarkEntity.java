package com.example.vehicleCrud.jpa.entity;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "trademark")
@Getter
@Setter
@NoArgsConstructor
public class VehicleTrademarkEntity {

	@Id
	@UuidGenerator
	private String id;
	private String name;
}

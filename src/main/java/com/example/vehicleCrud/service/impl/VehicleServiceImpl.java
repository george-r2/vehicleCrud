package com.example.vehicleCrud.service.impl;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.vehicleCrud.domain.VehicleDO;
import com.example.vehicleCrud.jpa.port.VehiclePort;
import com.example.vehicleCrud.service.VehicleService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService{

	Logger log = LoggerFactory.getLogger(VehicleServiceImpl.class);
	private final VehiclePort vehiclePort;

	@Override
	@Transactional
	public VehicleDO createVehicle(VehicleDO vehicle) {
		log.info("Creating vehicle");
		vehicle.setIngressDate(LocalDateTime.now());
		vehicle.setStatus("CREATED");
		return vehiclePort.createVehicle(vehicle);
	}

	@Override
	@Transactional
	public VehicleDO getVehicleById(String id) {
		log.info("Getting vehicle with Id {}", id);
		return vehiclePort.getVehicleById(id);
	}
	
}

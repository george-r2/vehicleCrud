package com.example.vehicleCrud.service;

import com.example.vehicleCrud.domain.VehicleDO;

public interface VehicleService {

	VehicleDO createVehicle(VehicleDO vehicle);
	
	VehicleDO getVehicleById(String id);
}

package com.example.vehicleCrud.jpa.port;

import java.util.List;

import com.example.vehicleCrud.domain.VehicleDO;

public interface VehiclePort {

	VehicleDO createVehicle(VehicleDO vehicle);
	VehicleDO getVehicleById(String id);
	List<VehicleDO> getVehicleByTrademark(String trademarkId);
	
}

package com.example.vehicleCrud.controller.mapper;

import org.mapstruct.Mapper;

import com.example.vehicleCrud.controller.request.CreateVehicleRequest;
import com.example.vehicleCrud.controller.response.CreateVehicleResponse;
import com.example.vehicleCrud.domain.VehicleDO;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VehicleControllerMapper {

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ingressDate", ignore = true)
	@Mapping(target = "status", ignore = true)
	VehicleDO requestToDomain(CreateVehicleRequest request);
	
	CreateVehicleResponse domainToResponse(VehicleDO domain);
}

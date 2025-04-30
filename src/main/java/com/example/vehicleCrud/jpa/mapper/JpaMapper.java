package com.example.vehicleCrud.jpa.mapper;

import org.mapstruct.Mapper;

import com.example.vehicleCrud.domain.VehicleDO;
import com.example.vehicleCrud.domain.VehicleTrademarkDO;
import com.example.vehicleCrud.jpa.entity.VehicleEntity;
import com.example.vehicleCrud.jpa.entity.VehicleTrademarkEntity;

@Mapper(componentModel = "spring")
public interface JpaMapper {

	VehicleDO entityToDomain(VehicleEntity entity);

	VehicleEntity domainToEntity(VehicleDO domain);
	
	VehicleTrademarkDO entityToDomain(VehicleTrademarkEntity entity);
	
	VehicleTrademarkEntity domainToEntity(VehicleTrademarkDO domain);
}

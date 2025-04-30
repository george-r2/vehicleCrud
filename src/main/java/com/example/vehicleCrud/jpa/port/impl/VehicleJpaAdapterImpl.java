package com.example.vehicleCrud.jpa.port.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.vehicleCrud.domain.VehicleDO;
import com.example.vehicleCrud.jpa.entity.VehicleEntity;
import com.example.vehicleCrud.jpa.mapper.JpaMapper;
import com.example.vehicleCrud.jpa.port.VehiclePort;
import com.example.vehicleCrud.jpa.repository.VehicleJpaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VehicleJpaAdapterImpl implements VehiclePort{

	private final VehicleJpaRepository repository;
	private final JpaMapper mapper;
	
	@Override
	public VehicleDO createVehicle(VehicleDO vehicle) {
		VehicleEntity entity = mapper.domainToEntity(vehicle);
		entity = repository.save(entity);
		return mapper.entityToDomain(entity);
	}

	@Override
	public VehicleDO getVehicleById(String id) {
		Optional<VehicleEntity> entity =  repository.findById(id);
		return mapper.entityToDomain(entity.orElse(null));
	}

	@Override
	public List<VehicleDO> getVehicleByTrademark(String trademarkId) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.example.vehicleCrud.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vehicleCrud.jpa.entity.VehicleEntity;

@Repository
public interface VehicleJpaRepository extends JpaRepository<VehicleEntity, String>{

}

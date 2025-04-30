package com.example.vehicleCrud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehicleCrud.controller.mapper.VehicleControllerMapper;
import com.example.vehicleCrud.controller.request.CreateVehicleRequest;
import com.example.vehicleCrud.controller.response.CreateVehicleResponse;
import com.example.vehicleCrud.service.VehicleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
public class VehicleController {

	private static final Logger log = LoggerFactory.getLogger(VehicleController.class);
	private final VehicleService service;
	private final VehicleControllerMapper mapper;
	
	@PostMapping
	public CreateVehicleResponse createVehicle(@RequestBody CreateVehicleRequest request) {
		return mapper.domainToResponse(
				service.createVehicle(mapper.requestToDomain(request)));
		
	}
}

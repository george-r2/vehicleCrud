package com.example.vehicleCrud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehicleCrud.controller.mapper.VehicleControllerMapper;
import com.example.vehicleCrud.controller.request.CreateVehicleRequest;
import com.example.vehicleCrud.controller.response.CreateVehicleResponse;
import com.example.vehicleCrud.controller.response.GetVehicleResponse;
import com.example.vehicleCrud.service.VehicleService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
@Valid
public class VehicleController {

	private static final Logger log = LoggerFactory.getLogger(VehicleController.class);
	private final VehicleService service;
	private final VehicleControllerMapper mapper;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CreateVehicleResponse createVehicle(
			@Valid @RequestBody CreateVehicleRequest request) {
		return mapper.domainToResponse(
				service.createVehicle(mapper.requestToDomain(request)));
		
	}
	
	@GetMapping("/{vehicleId}")
	public GetVehicleResponse getVehicleById(@PathVariable("vehicleId") String id) {
		service.getVehicleById(id);
		return null;
	}
	
}

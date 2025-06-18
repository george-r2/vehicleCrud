package com.example.vehicleCrud.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleCrudException extends RuntimeException{

	private static final long serialVersionUID = -2076916295990349096L;

	public VehicleCrudException(String msg) {
		super(msg);
	}
	
}

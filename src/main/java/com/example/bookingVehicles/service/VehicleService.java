package com.example.bookingVehicles.service;

import com.example.bookingVehicles.model.Vehicle;
import com.example.bookingVehicles.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository){
        this.vehicleRepository =vehicleRepository;
    }
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
    public List<Vehicle> getAllVehicle() {
        return vehicleRepository.findAll();
    }

    public Vehicle getVehicleById(String id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    public Vehicle updateVehicle(String id, Vehicle vehicle) {
        // Check if vehicle exists
        Vehicle existingVehicle = vehicleRepository.findById(id).orElse(null);

        if (existingVehicle == null) {
            return null; // or throw exception
        }

        // Update fields
        existingVehicle.setType(vehicle.getType());
        existingVehicle.setName(vehicle.getName());
        existingVehicle.setPrice(vehicle.getPrice());
        existingVehicle.setOwner(vehicle.getOwner());
        existingVehicle.setDetails(vehicle.getDetails());
        existingVehicle.setImageUrl(vehicle.getImageUrl());

        // Save updated vehicle
        return vehicleRepository.save(existingVehicle);
    }


}

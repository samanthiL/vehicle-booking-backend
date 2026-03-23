package com.example.bookingVehicles.controller;

import com.example.bookingVehicles.model.Vehicle;
import com.example.bookingVehicles.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
@CrossOrigin("*")

public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping
    public Vehicle createBooking(@RequestBody Vehicle vehicle) {
        return vehicleService.createVehicle(vehicle);
    }

    @GetMapping
    public List<Vehicle> getAllBookings() {
        return vehicleService.getAllVehicle();
    }

    @GetMapping("/{id}")
    public Vehicle getBooking(@PathVariable String id) {
        return vehicleService.getVehicleById(id);
    }
}

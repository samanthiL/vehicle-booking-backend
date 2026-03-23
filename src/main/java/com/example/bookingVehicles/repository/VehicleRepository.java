package com.example.bookingVehicles.repository;


import com.example.bookingVehicles.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepository extends MongoRepository<Vehicle,String> {

}

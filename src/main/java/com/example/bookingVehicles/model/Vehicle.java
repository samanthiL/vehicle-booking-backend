package com.example.bookingVehicles.model;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Getter
@Setter
@Document(collection = "Vehicle")
    public class Vehicle {

        @Id
        private String id;

        private String type;
        private String name;
        private Double price;
        private String owner;
        private String details;
        private String imageUrl;
        // Getters & Setters
    }


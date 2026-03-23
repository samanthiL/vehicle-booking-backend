package com.example.bookingVehicles.model;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Getter
@Setter
@Document(collection = "booking")
public class Booking {

    @Id
    private Long id;

    private String memberName;
    private String memberEmail;
    private String memberPhone;
    private Double discount;
    private Double total;

    private List<Vehicle> vehicles;

    // Getters & Setters
}
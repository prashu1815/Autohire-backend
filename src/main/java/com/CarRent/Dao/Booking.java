package com.CarRent.Dao;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "Booking")
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    private Long carId;
    private Long userId;

    private LocalDate startDate;
    private LocalDate endDate;
    private Double totalPrice;

    private String status = "Pending";

    // ✅ Add this relation to fetch car info
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "carId", referencedColumnName = "carId", insertable = false, updatable = false)
    private Car car;
}

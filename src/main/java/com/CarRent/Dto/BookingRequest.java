package com.CarRent.Dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
public class BookingRequest {
    private Long carId;
    private Long userId;
    private LocalDate startDate;
    private LocalDate endDate;
}

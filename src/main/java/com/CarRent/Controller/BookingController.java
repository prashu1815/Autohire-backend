package com.CarRent.Controller;

import com.CarRent.Dao.Booking;
import com.CarRent.Dto.BookingRequest;
import com.CarRent.Service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

 // ✅ Require USER role
    @PostMapping
    public Booking createBooking(@RequestBody BookingRequest booking) {
        return bookingService.createBooking(booking);
    }


    @GetMapping("/user/{userId}")
    public List<Booking> getUserBookings(@PathVariable Long userId) {
        return bookingService.getBookingsByUser(userId);
    }


    @DeleteMapping("/{id}")
    public void cancelBooking(@PathVariable Long id) {
        bookingService.cancelBooking(id);
    }
}

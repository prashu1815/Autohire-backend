package com.CarRent.Service;

import com.CarRent.Dao.Booking;
import com.CarRent.Dao.Car;
import com.CarRent.Dto.BookingRequest;
import com.CarRent.Repository.BookingRepository;
import com.CarRent.Repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService {


    private final BookingRepository bookingRepo;

    private final CarRepository carRepo;

    public Booking createBooking(@RequestBody BookingRequest booking) {
        Car car = carRepo.findById(booking.getCarId()).orElse(null);
        if (car == null || !car.isAvailability()) {
            throw new RuntimeException("Car is not available for booking");
        }

        long days = ChronoUnit.DAYS.between(booking.getStartDate(), booking.getEndDate());
        double totalPrice = days * car.getPricePerDay();

        Booking book=new Booking();

        book.setCarId(booking.getCarId());
        book.setUserId(booking.getUserId());
        book.setStartDate(booking.getStartDate());
        book.setEndDate(booking.getEndDate());
        book.setTotalPrice(totalPrice);
        return bookingRepo.save(book);
    }

    public List<Booking> getBookingsByUser(Long userId) {
        return bookingRepo.findByUserId(userId);
    }

    public void cancelBooking(Long id) {
        bookingRepo.deleteById(id);
    }
}
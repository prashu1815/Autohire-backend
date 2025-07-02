package com.CarRent.Controller;

import com.CarRent.Dao.Car;
import com.CarRent.Service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cars") // ✅ Better to keep consistent base path
@RequiredArgsConstructor
public class CarController {

    private final CarService cs;

    @GetMapping
    public List<Car> getAll() {
        return cs.getCars();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
        return cs.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

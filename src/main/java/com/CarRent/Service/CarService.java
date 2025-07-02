package com.CarRent.Service;

import com.CarRent.Dao.Car;
import com.CarRent.Repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository cr;

    public List<Car> getCars(){

        return cr.findAll();
    }

    public Optional<Car> findById(Long id){
        return cr.findById(id);
    }

}

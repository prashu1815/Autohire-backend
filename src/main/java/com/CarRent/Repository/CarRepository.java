package com.CarRent.Repository;

import com.CarRent.Dao.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}

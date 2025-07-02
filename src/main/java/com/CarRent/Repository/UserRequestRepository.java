package com.CarRent.Repository;

import com.CarRent.Dao.Details;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRequestRepository extends JpaRepository<Details,Long> {

}

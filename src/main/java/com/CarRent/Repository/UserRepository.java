package com.CarRent.Repository;

import com.CarRent.Dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email); // or findByName if using name for login
}

package com.CarRent.Dao;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Details")
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Details_id;

    private String email;

    private String License;

    private Long Adhar;

    private String pan;
}

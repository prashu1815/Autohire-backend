package com.CarRent.Dto;

import lombok.Data;

@Data
public class AuthRequest {

    private String email;
    private String password;
}

package com.CarRent.Dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserRequest {

    private String email;

    private String License;

    private Long Adhar;

    private String pan;
}

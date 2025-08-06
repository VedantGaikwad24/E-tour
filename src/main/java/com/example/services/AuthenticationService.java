package com.example.services;

import com.example.dto.LoginRequestDTO;
import com.example.dto.SignupRequestDTO;
import com.example.models.Authentication;

public interface AuthenticationService {
    Authentication register(SignupRequestDTO signupDTO);
    boolean login(LoginRequestDTO loginDTO);
}

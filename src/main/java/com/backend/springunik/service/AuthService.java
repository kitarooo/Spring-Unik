package com.backend.springunik.service;


import com.backend.springunik.dto.request.LoginRequest;
import com.backend.springunik.dto.request.RegistrationRequest;
import com.backend.springunik.dto.response.AuthenticationResponse;

public interface AuthService {
    AuthenticationResponse login(LoginRequest request);
    String registration(RegistrationRequest request);
}

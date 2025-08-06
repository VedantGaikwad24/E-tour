package com.example.services;

import com.example.dto.LoginRequestDTO;
import com.example.dto.SignupRequestDTO;
import com.example.models.Authentication;
import com.example.repositories.AuthenticationRepository;
import com.example.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private AuthenticationRepository authRepo;

    @Override
    public Authentication register(SignupRequestDTO signupDTO) {
        Authentication auth = new Authentication();
        auth.setUsername(signupDTO.getUsername());
        auth.setPassword(signupDTO.getPassword());
        auth.setConfirmpassword(signupDTO.getConfirmpassword());

        return authRepo.save(auth);
    }

    @Override
    public boolean login(LoginRequestDTO loginDTO) {
        Optional<Authentication> authOpt = authRepo.findByUsernameAndPassword(
                loginDTO.getUsername(),
                loginDTO.getPassword()
        );
        return authOpt.isPresent();
    }
}

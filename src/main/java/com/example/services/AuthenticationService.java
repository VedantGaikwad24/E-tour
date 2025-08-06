<<<<<<< HEAD
package com.example.services;

import com.example.dto.LoginRequestDTO;
import com.example.dto.SignupRequestDTO;
import com.example.models.Authentication;

public interface AuthenticationService {
    Authentication register(SignupRequestDTO signupDTO);
    boolean login(LoginRequestDTO loginDTO);
}
=======
package com.example.services;

import com.example.models.Authentication;

import java.util.List;
import java.util.Optional;

public interface AuthenticationService {
    Authentication createAuthentication(Authentication auth);
    List<Authentication> getAllAuthentications();
    Optional<Authentication> getAuthenticationById(int id);
    Optional<Authentication> getAuthenticationByUsername(String username);
    void deleteAuthentication(int id);
}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59

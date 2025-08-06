<<<<<<< HEAD
package com.example.repositories;

import com.example.models.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthenticationRepository extends JpaRepository<Authentication, Integer> {
    Optional<Authentication> findByUsernameAndPassword(String username, String password);
}
=======
package com.example.repositories;

import com.example.models.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AuthenticationRepository extends JpaRepository<Authentication, Integer> {
    Optional<Authentication> findByUsername(String username);
}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59

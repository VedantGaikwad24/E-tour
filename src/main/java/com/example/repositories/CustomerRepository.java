<<<<<<< HEAD
package com.example.repositories;

import com.example.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findByCustEmail(String email);  // for future use like login/lookup
}
=======
package com.example.repositories;

import com.example.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findByCustEmail(String email);  // for future use like login/lookup
}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59

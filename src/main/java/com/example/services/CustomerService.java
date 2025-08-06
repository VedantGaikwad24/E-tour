<<<<<<< HEAD
package com.example.services;

import com.example.models.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Optional<Customer> getCustomerById(int id);
    Customer createCustomer(Customer customer);
    
}
=======
package com.example.services;

import com.example.models.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Optional<Customer> getCustomerById(int id);
    Customer createCustomer(Customer customer);
    
}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59

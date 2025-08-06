<<<<<<< HEAD
package com.example.services;

import com.example.models.Passenger;

import java.util.List;
import java.util.Optional;

public interface PassengerService {
    Passenger savePassenger(Passenger passenger);
    List<Passenger> getAllPassengers();
    Optional<Passenger> getPassengerById(int id);
    void deletePassenger(int id);
    Passenger savePassengerWithCustomer(int custId, Passenger passenger);

}
=======
package com.example.services;

import com.example.models.Passenger;

import java.util.List;
import java.util.Optional;

public interface PassengerService {
    Passenger savePassenger(Passenger passenger);
    List<Passenger> getAllPassengers();
    Optional<Passenger> getPassengerById(int id);
    void deletePassenger(int id);
    Passenger savePassengerWithCustomer(int custId, Passenger passenger);

}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59

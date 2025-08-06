<<<<<<< HEAD
package com.example.services;

import com.example.models.Departure;
import java.util.List;
import java.util.Optional;

public interface DepartureService {
    Departure saveDeparture(Departure departure);
    Optional<Departure> getDepartureById(int id);
    List<Departure> getAllDepartures();
    void deleteDeparture(int id);
}
=======
package com.example.services;

import com.example.models.Departure;
import java.util.List;
import java.util.Optional;

public interface DepartureService {
    Departure saveDeparture(Departure departure);
    Optional<Departure> getDepartureById(int id);
    List<Departure> getAllDepartures();
    void deleteDeparture(int id);
}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59

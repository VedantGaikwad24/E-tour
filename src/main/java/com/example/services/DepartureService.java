package com.example.services;

import com.example.dto.DepartureDatesDTO;
import com.example.dto.NoOfDaysDTO;
import com.example.models.Departure;
import java.util.List;
import java.util.Optional;

public interface DepartureService {
    Departure saveDeparture(Departure departure);
    Optional<Departure> getDepartureById(int id);
    List<Departure> getAllDepartures();
    void deleteDeparture(int id);
    List<DepartureDatesDTO> getAllDepartureDates();
	List<NoOfDaysDTO> getAllNoOfDays();

}

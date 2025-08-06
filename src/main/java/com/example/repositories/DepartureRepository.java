
package com.example.repositories;

import com.example.dto.DepartureDatesDTO;
import com.example.dto.NoOfDaysDTO;
import com.example.models.Departure;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartureRepository extends JpaRepository<Departure, Integer> {
	
	@Query("select new com.example.dto.DepartureDatesDTO(d.departDate, d.endDate) from Departure d")
	List<DepartureDatesDTO> findAllDepartureDates();

	@Query("select new com.example.dto.NoOfDaysDTO(d.noOfDays) from Departure d")
	List<NoOfDaysDTO> findAllNoOfDays();



}

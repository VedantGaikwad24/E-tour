package com.example.repositories;

import com.example.models.ItineraryMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItineraryRepository extends JpaRepository<ItineraryMaster, Integer> {
    List<ItineraryMaster> findByPackageMaster_PackageIdOrderByDayNoAsc(Integer packageId);
}

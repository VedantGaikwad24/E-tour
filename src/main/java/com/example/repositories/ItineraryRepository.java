<<<<<<< HEAD
package com.example.repositories;

import com.example.models.ItineraryMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItineraryRepository extends JpaRepository<ItineraryMaster, Integer> {
    List<ItineraryMaster> findByPackageMaster_PackageIdOrderByDayNoAsc(Integer packageId);
}
=======
package com.example.repositories;

import com.example.models.ItineraryMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItineraryRepository extends JpaRepository<ItineraryMaster, Integer> {
    List<ItineraryMaster> findByPackageMaster_PackageIdOrderByDayNoAsc(Integer packageId);
}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59

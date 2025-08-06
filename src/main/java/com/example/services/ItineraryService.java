<<<<<<< HEAD
package com.example.services;

import com.example.models.ItineraryMaster;
import java.util.List;
import java.util.Optional;

public interface ItineraryService {
    
    List<ItineraryMaster> getAllItineraries();  // ✅ Needed in controller
    Optional<ItineraryMaster> getItineraryById(int id);  // ✅ Needed in controller
    List<ItineraryMaster> getItinerariesByPackage(Integer packageId);  // ✅ Needed in controller
}
=======
package com.example.services;

import com.example.models.ItineraryMaster;

import java.util.List;
import java.util.Optional;
public interface ItineraryService {
    List<ItineraryMaster> getItinerariesByPackage(Integer packageId);
}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59

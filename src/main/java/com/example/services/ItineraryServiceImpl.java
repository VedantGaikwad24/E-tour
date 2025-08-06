<<<<<<< HEAD
package com.example.services;

import com.example.models.ItineraryMaster;
import com.example.repositories.ItineraryRepository;
import com.example.services.ItineraryService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class ItineraryServiceImpl implements ItineraryService {

	 @Autowired
	    private ItineraryRepository itineraryRepository;

	    @Override
	    public List<ItineraryMaster> getAllItineraries() {
	        return itineraryRepository.findAll();
	    }

	    @Override
	    public java.util.Optional<ItineraryMaster> getItineraryById(int id) {
	        return itineraryRepository.findById(id);
	    }

	    @Override
	    @Transactional(readOnly = true)
	    public List<ItineraryMaster> getItinerariesByPackage(Integer packageId) {
	        List<ItineraryMaster> list = itineraryRepository.findByPackageMaster_PackageIdOrderByDayNoAsc(packageId);
	        if (list.isEmpty()) {
	            throw new ResponseStatusException(
	                    HttpStatus.NOT_FOUND, "No itineraries found for package id " + packageId);
	        }
	        return list;
	    }
=======
package com.example.services;

import com.example.models.ItineraryMaster;
import com.example.repositories.ItineraryRepository;
import com.example.services.ItineraryService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class ItineraryServiceImpl implements ItineraryService {

	@Autowired
    private ItineraryRepository itineraryRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ItineraryMaster> getItinerariesByPackage(Integer packageId) {
        List<ItineraryMaster> list = itineraryRepository.findByPackageMaster_PackageIdOrderByDayNoAsc(packageId);
        if (list.isEmpty()) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "No itineraries found for package id " + packageId);
        }
        return list;
    }
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59
}
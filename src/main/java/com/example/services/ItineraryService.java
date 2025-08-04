package com.example.services;

import com.example.models.ItineraryMaster;

import java.util.List;

public interface ItineraryService {
    List<ItineraryMaster> getItinerariesByPackage(Integer packageId);
}

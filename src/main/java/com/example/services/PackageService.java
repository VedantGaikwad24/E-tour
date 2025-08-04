package com.example.services;

import com.example.models.PackageMaster;

import java.util.List;

public interface PackageService {

    List<PackageMaster> getPackagesByCategory(Integer ctgMasterId);

    List<PackageMaster> getPackagesWithItinerariesByCategory(Integer ctgMasterId);

    PackageMaster getPackageById(Integer packageId);

    PackageMaster getPackageWithItineraryById(Integer packageId);
}

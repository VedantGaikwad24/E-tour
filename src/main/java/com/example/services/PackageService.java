<<<<<<< HEAD
package com.example.services;

import com.example.models.PackageMaster;
import java.util.List;
import java.util.Optional;

public interface PackageService {

    List<PackageMaster> getPackagesByCategory(Integer ctgMasterId);

    List<PackageMaster> getPackagesWithItinerariesByCategory(Integer ctgMasterId);

    PackageMaster getPackageById(Integer packageId);

    PackageMaster getPackageWithItineraryById(Integer packageId);
    
    List<PackageMaster> getAllPackages();
=======
package com.example.services;

import com.example.models.PackageMaster;
import java.util.List;
import java.util.Optional;

public interface PackageService {

    List<PackageMaster> getPackagesByCategory(Integer ctgMasterId);

    List<PackageMaster> getPackagesWithItinerariesByCategory(Integer ctgMasterId);

    PackageMaster getPackageById(Integer packageId);

    PackageMaster getPackageWithItineraryById(Integer packageId);
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59
}
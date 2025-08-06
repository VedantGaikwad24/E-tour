package com.example.controllers;

import com.example.models.PackageMaster;
import com.example.services.PackageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/packages")
@CrossOrigin(origins = "*")
public class PackageMasterController {

    @Autowired
    private PackageService packageService;

   

    @GetMapping
    public ResponseEntity<List<PackageMaster>> getAllPackages() {
        return ResponseEntity.ok(packageService.getAllPackages());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PackageMaster> getPackageById(@PathVariable int id) {
        PackageMaster pkg = packageService.getPackageById(id);
        return ResponseEntity.ok(pkg);
    }


}

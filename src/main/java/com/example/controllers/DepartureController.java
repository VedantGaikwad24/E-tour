<<<<<<< HEAD
package com.example.controllers;

import com.example.models.Departure;
import com.example.services.DepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departures")
public class DepartureController {

    @Autowired
    private DepartureService departureService;

    @PostMapping
    public ResponseEntity<Departure> createDeparture(@RequestBody Departure departure) {
        return ResponseEntity.ok(departureService.saveDeparture(departure));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Departure> getDepartureById(@PathVariable int id) {
        return departureService.getDepartureById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Departure> getAllDepartures() {
        return departureService.getAllDepartures();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDeparture(@PathVariable int id) {
        departureService.deleteDeparture(id);
        return ResponseEntity.noContent().build();
    }
}
=======
package com.example.controllers;

import com.example.models.Departure;
import com.example.services.DepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departures")
public class DepartureController {

    @Autowired
    private DepartureService departureService;

    @PostMapping
    public ResponseEntity<Departure> createDeparture(@RequestBody Departure departure) {
        return ResponseEntity.ok(departureService.saveDeparture(departure));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Departure> getDepartureById(@PathVariable int id) {
        return departureService.getDepartureById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Departure> getAllDepartures() {
        return departureService.getAllDepartures();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDeparture(@PathVariable int id) {
        departureService.deleteDeparture(id);
        return ResponseEntity.noContent().build();
    }
}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59

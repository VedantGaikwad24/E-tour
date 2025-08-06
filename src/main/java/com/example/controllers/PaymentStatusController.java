<<<<<<< HEAD
package com.example.controllers;

import com.example.models.PaymentStatus;
import com.example.services.PaymentStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment-status")
public class PaymentStatusController {

    @Autowired
    private PaymentStatusService paymentStatusService;

    @PostMapping
    public PaymentStatus create(@RequestBody PaymentStatus paymentStatus) {
        return paymentStatusService.save(paymentStatus);
    }

    @GetMapping
    public List<PaymentStatus> getAll() {
        return paymentStatusService.getAll();
    }

    @GetMapping("/{id}")
    public PaymentStatus getById(@PathVariable int id) {
        return paymentStatusService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        paymentStatusService.deleteById(id);
    }

    @GetMapping("/by-customer/{custId}")
    public List<PaymentStatus> getByCustomerId(@PathVariable int custId) {
        return paymentStatusService.getByCustomerId(custId);
    }

    @GetMapping("/by-booking/{bookingId}")
    public List<PaymentStatus> getByBookingId(@PathVariable int bookingId) {
        return paymentStatusService.getByBookingId(bookingId);
    }
}
=======
package com.example.controllers;

import com.example.models.PaymentStatus;
import com.example.services.PaymentStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment-status")
public class PaymentStatusController {

    @Autowired
    private PaymentStatusService paymentStatusService;

    @PostMapping
    public PaymentStatus create(@RequestBody PaymentStatus paymentStatus) {
        return paymentStatusService.save(paymentStatus);
    }

    @GetMapping
    public List<PaymentStatus> getAll() {
        return paymentStatusService.getAll();
    }

    @GetMapping("/{id}")
    public PaymentStatus getById(@PathVariable int id) {
        return paymentStatusService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        paymentStatusService.deleteById(id);
    }

    @GetMapping("/by-customer/{custId}")
    public List<PaymentStatus> getByCustomerId(@PathVariable int custId) {
        return paymentStatusService.getByCustomerId(custId);
    }

    @GetMapping("/by-booking/{bookingId}")
    public List<PaymentStatus> getByBookingId(@PathVariable int bookingId) {
        return paymentStatusService.getByBookingId(bookingId);
    }
}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59

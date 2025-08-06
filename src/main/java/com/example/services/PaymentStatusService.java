<<<<<<< HEAD
package com.example.services;

import com.example.models.PaymentStatus;

import java.util.List;

public interface PaymentStatusService {
    PaymentStatus save(PaymentStatus paymentStatus);
    List<PaymentStatus> getAll();
    PaymentStatus getById(int id);
    void deleteById(int id);
    List<PaymentStatus> getByCustomerId(int custId);
    List<PaymentStatus> getByBookingId(int bookingId);
}
=======
package com.example.services;

import com.example.models.PaymentStatus;

import java.util.List;

public interface PaymentStatusService {
    PaymentStatus save(PaymentStatus paymentStatus);
    List<PaymentStatus> getAll();
    PaymentStatus getById(int id);
    void deleteById(int id);
    List<PaymentStatus> getByCustomerId(int custId);
    List<PaymentStatus> getByBookingId(int bookingId);
}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59

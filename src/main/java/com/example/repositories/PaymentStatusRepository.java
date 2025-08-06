<<<<<<< HEAD
package com.example.repositories;

import com.example.models.PaymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentStatusRepository extends JpaRepository<PaymentStatus, Integer> {
    List<PaymentStatus> findByCustomer_CustId(int custId);
    List<PaymentStatus> findByBooking_BookingId(int bookingId);
}
=======
package com.example.repositories;

import com.example.models.PaymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentStatusRepository extends JpaRepository<PaymentStatus, Integer> {
    List<PaymentStatus> findByCustomer_CustId(int custId);
    List<PaymentStatus> findByBooking_BookingId(int bookingId);
}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59

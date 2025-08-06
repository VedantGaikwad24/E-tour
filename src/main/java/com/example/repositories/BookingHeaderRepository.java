<<<<<<< HEAD
package com.example.repositories;

import com.example.models.BookingHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingHeaderRepository extends JpaRepository<BookingHeader, Integer> {
    List<BookingHeader> findByCustomerCustId(int custId); 
}
=======
package com.example.repositories;

import com.example.models.BookingHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingHeaderRepository extends JpaRepository<BookingHeader, Integer> {
    List<BookingHeader> findByCustomerCustId(int custId);  // Fetch bookings by Customer ID
}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59

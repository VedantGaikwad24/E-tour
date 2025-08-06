<<<<<<< HEAD
package com.example.services;

import com.example.models.BookingHeader;
import java.util.List;
import java.util.Optional;

public interface BookingHeaderService {
    BookingHeader createBooking(BookingHeader booking);
    List<BookingHeader> getAllBookings();
    Optional<BookingHeader> getBookingById(int id);
    List<BookingHeader> getBookingsByCustomerId(int customerId);
}
=======
package com.example.services;

import com.example.models.BookingHeader;
import java.util.List;
import java.util.Optional;

public interface BookingHeaderService {
    BookingHeader createBooking(BookingHeader booking);
    List<BookingHeader> getAllBookings();
    Optional<BookingHeader> getBookingById(int id);
    List<BookingHeader> getBookingsByCustomerId(int customerId);
}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59

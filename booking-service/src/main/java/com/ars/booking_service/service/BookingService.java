package com.ars.booking_service.service;

import com.ars.booking_service.request.BookingRequest;
import com.ars.booking_service.response.BookinResponse;

public interface BookingService {
    BookinResponse createBooking(BookingRequest request);
}

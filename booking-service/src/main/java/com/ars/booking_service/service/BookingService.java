package com.ars.booking_service.service;

import com.ars.booking_service.request.BookingRequest;
import com.ars.booking_service.response.BookingResponse;

public interface BookingService {
    BookingResponse createBooking(BookingRequest request);
}

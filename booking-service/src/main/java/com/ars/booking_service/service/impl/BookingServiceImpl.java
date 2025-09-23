package com.ars.booking_service.service.impl;

import com.ars.booking_service.request.BookingRequest;
import com.ars.booking_service.response.BookinResponse;
import com.ars.booking_service.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {


    @Override
    public BookinResponse createBooking(BookingRequest request) {
        return null;
    }
}

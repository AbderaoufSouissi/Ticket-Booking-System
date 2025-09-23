package com.ars.booking_service.controller;

import com.ars.booking_service.request.BookingRequest;
import com.ars.booking_service.response.BookinResponse;
import com.ars.booking_service.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService;


    @PostMapping("/booking")
    public BookinResponse createBooking(@RequestBody BookingRequest request){
        return bookingService.createBooking(request);
    }
}

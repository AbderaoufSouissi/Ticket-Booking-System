package com.ars.booking_service.service.impl;

import com.ars.booking_service.entity.Customer;
import com.ars.booking_service.exception.ResourceNotFoundException;
import com.ars.booking_service.repository.CustomerRepository;
import com.ars.booking_service.request.BookingRequest;
import com.ars.booking_service.response.BookinResponse;
import com.ars.booking_service.service.BookingService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final CustomerRepository customerRepository;


    @Override
    public BookinResponse createBooking(final BookingRequest request) {
        final Customer customer = customerRepository.findById(request.userId()).orElseThrow(()-> new ResourceNotFoundException("Customer not found"));
        return new BookinResponse();
    }
}

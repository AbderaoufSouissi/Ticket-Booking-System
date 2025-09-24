package com.ars.booking_service.service.impl;

import com.ars.booking_service.client.InventoryServiceClient;
import com.ars.booking_service.entity.Customer;
import com.ars.booking_service.exception.ResourceNotFoundException;
import com.ars.booking_service.repository.CustomerRepository;
import com.ars.booking_service.request.BookingRequest;
import com.ars.booking_service.response.BookingResponse;
import com.ars.booking_service.response.InventoryResponse;
import com.ars.booking_service.service.BookingService;
import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final CustomerRepository customerRepository;
    private final InventoryServiceClient inventoryServiceClient;


    @Override
    public BookingResponse createBooking(final BookingRequest request) {
        final Customer customer = customerRepository.findById(request.userId()).orElseThrow(()-> new ResourceNotFoundException("Customer not found"));
        final InventoryResponse response = inventoryServiceClient.getInventory(request.eventId());
        log.info("inventory response: {}", response);
        if(response.capacity() < request.ticketCount()){
            throw new RuntimeException("Not enough inventoryd");
        }
        return new BookingResponse("booking was successful");
    }
}

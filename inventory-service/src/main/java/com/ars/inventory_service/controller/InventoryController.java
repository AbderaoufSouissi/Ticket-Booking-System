package com.ars.inventory_service.controller;

import com.ars.inventory_service.response.EventInventoryResponse;
import com.ars.inventory_service.response.VenueInventoryResponse;
import com.ars.inventory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/inventory/events")
    public ResponseEntity<List<EventInventoryResponse>> getAllEvents() {
        return new ResponseEntity<>(inventoryService.getAllEvents(), HttpStatus.OK);
    }


    @GetMapping("/inventory/venue/{venueId}")
    public ResponseEntity<VenueInventoryResponse> getVenueById(@PathVariable Long venueId) {
        return new ResponseEntity<>(inventoryService.getVenueById(venueId), HttpStatus.OK);

    }

    @GetMapping("/inventory/event/{id}")
    public ResponseEntity<EventInventoryResponse> getEvent(@PathVariable Long id) {
        return new ResponseEntity<>(inventoryService.getEventById(id), HttpStatus.OK);

    }


}

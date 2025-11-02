package com.ars.inventory_service.service;

import com.ars.inventory_service.response.EventInventoryResponse;
import com.ars.inventory_service.response.VenueInventoryResponse;


import java.util.List;

public interface InventoryService {
    List<EventInventoryResponse> getAllEvents();
    VenueInventoryResponse getVenueById(Long venueId);
    EventInventoryResponse getEventById(Long id);
}

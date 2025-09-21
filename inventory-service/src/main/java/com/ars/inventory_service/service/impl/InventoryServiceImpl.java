package com.ars.inventory_service.service.impl;

import com.ars.inventory_service.entity.Event;
import com.ars.inventory_service.entity.Venue;
import com.ars.inventory_service.exception.ResourceNotFoundException;
import com.ars.inventory_service.repository.EventRepository;
import com.ars.inventory_service.repository.VenueRepository;
import com.ars.inventory_service.response.EventInventoryResponse;
import com.ars.inventory_service.response.VenueInventoryResponse;
import com.ars.inventory_service.service.InventoryService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    private final EventRepository eventRepository;
    private final VenueRepository venueRepository;



    @Override
    public List<EventInventoryResponse> getAllEvents() {
        final List<Event> events = eventRepository.findAll();
        return events.stream()
                .map(event -> new EventInventoryResponse(event.getName(),event.getLeftCapacity(),event.getVenue()))
                .toList();
    }

    @Override
    public VenueInventoryResponse getVenueById(Long venueId) {
        final Venue venue  = venueRepository.findById(venueId)
                .orElseThrow(()-> new ResourceNotFoundException("Venue with id: "+venueId+" not found"));
        return new VenueInventoryResponse(venue.getId(),venue.getName(),venue.getTotalCapacity());
    }


}

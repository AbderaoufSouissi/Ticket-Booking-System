package com.ars.inventory_service.response;

import com.ars.inventory_service.entity.Venue;

import java.math.BigDecimal;

public record EventInventoryResponse(
        Long eventId,
        String event,
        int capacity,
        Venue venue,
        BigDecimal ticketPrice
)
{}

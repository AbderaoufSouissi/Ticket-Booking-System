package com.ars.booking_service.response;

import java.math.BigDecimal;

public record InventoryResponse(
        Long eventId,
        String event,
        int capacity,
        VenueResponse venue,
        BigDecimal ticketPrice

)


{}

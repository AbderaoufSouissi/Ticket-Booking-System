package com.ars.booking_service.event;

import java.math.BigDecimal;

public record BookingEvent(
        Long userId,
        Long eventId,
        int ticketCount,
        BigDecimal totalPrice
)
{}

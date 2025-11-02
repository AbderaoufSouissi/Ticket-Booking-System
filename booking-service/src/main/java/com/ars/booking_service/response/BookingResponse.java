package com.ars.booking_service.response;

import java.math.BigDecimal;

public record BookingResponse(
        Long userId,
        Long eventId,
        int ticketCount,
        BigDecimal totalPrice
)
{}

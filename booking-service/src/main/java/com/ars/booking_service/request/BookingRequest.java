package com.ars.booking_service.request;

public record BookingRequest(Long userId, Long eventId, int ticketCount) {
}

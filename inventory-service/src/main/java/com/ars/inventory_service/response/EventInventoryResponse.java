package com.ars.inventory_service.response;

import com.ars.inventory_service.entity.Venue;

public record EventInventoryResponse(String event, int capacity, Venue venue) {
}

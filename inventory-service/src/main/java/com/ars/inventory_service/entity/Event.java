package com.ars.inventory_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "total_capacity", nullable = false)
    private int totalCapacity;
    @Column(name = "left_capacity", nullable = false)
    private int leftCapacity;

    @Column(name = "ticket_price", nullable = false)
    private BigDecimal ticketPrice;

    @ManyToOne
    @JoinColumn(name = "venue_id", nullable = false)
    private Venue venue;

}

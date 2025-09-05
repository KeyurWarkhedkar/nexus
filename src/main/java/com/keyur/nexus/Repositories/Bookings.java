package com.keyur.nexus.Repositories;

import com.keyur.nexus.Enums.BookingStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bookings {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private LocalDateTime bookedAt;

    private BookingStatus bookingStatus;

    private double total;

    @ManyToOne
    private Events event;

    @ManyToOne
    private User user;
}

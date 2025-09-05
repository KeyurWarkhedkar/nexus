package com.keyur.nexus.Repositories;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Events {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @NotNull(message="Name is a required field for event!")
    private String name;

    @NotNull(message="Date is a required field for event!")
    private LocalDate date;

    @NotNull(message="Location is a required field for event!")
    private String location;

    @NotNull(message="Area is a required field for event!")
    private String area;

    @NotNull(message="City is a required field for event!")
    private String city;

    @NotNull(message="State is a required field for event!")
    private String state;

    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bookings> bookings;
}

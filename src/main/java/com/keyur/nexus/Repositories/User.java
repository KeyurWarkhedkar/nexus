package com.keyur.nexus.Repositories;

import com.keyur.nexus.Enums.UserRoles;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @NotNull(message="Email is a required field for user!")
    private String email;

    @NotNull(message="First name is a required field for user!")
    private String firstName;

    private String lastName;

    @NotNull(message="Mobile number is a required field for user!")
    private String mobileNo;

    @NotNull(message="Password is a required field for user!")
    private String password;

    private LocalDateTime createdAt;

    private UserRoles role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bookings> bookings;
}

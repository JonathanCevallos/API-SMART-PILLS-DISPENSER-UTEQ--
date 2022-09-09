package com.example.apismartpillsdispenseruteq.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pill")
public class Pill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "description", length = 50)
    private String description;


    @Column(name = "registration_date")
    private LocalDateTime registration_date;

    @Column(name = "state")
    private Boolean state = true;


    @Column(name ="url_image")
    private String url_image;

    @PrePersist
    public void PrePersist() {
        registration_date = LocalDateTime.now();
    }
}

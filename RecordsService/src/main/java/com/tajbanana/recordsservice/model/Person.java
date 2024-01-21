package com.tajbanana.recordsservice.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "persons", schema = "records")
@Data
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String personalId;
    private String name;

    @Enumerated(EnumType.STRING)
    private Location location;

    public Person(String personalId, String name, Location location) {
        this.personalId = personalId;
        this.name = name;
        this.location = location;
    }

}

package com.tajbanana.recordsservice.repositories;

import com.tajbanana.recordsservice.model.Location;
import com.tajbanana.recordsservice.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByPersonalId(String personalId);
    Optional<List<Person>> findAllByLocation(Location location);
}

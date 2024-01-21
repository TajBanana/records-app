package com.tajbanana.recordsservice.controller;

import com.tajbanana.recordsservice.model.Location;
import com.tajbanana.recordsservice.model.Person;
import com.tajbanana.recordsservice.repositories.PersonRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DbController {
    private final PersonRepository personRepository;

    public DbController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/personalId/{personalId}")
    public ResponseEntity<Person> getPersonByPersonalId(@PathVariable String personalId) {
        Optional<Person> person = personRepository.findByPersonalId(personalId);
        return person.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/location/{locationName}")
    public ResponseEntity<List<Person>> getAllByLocation(@PathVariable Location locationName) {
        Optional<List<Person>> person = personRepository.findAllByLocation(locationName);
        return person.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<Person> create(@RequestBody Person person) {
        Person savedPerson = personRepository.save(person);
        return ResponseEntity.ok(savedPerson);
    } 

}

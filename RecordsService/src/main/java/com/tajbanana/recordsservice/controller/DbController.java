package com.tajbanana.recordsservice.controller;

import com.tajbanana.recordsservice.model.Location;
import com.tajbanana.recordsservice.model.Person;
import com.tajbanana.recordsservice.repositories.PersonRepository;
import org.springframework.http.HttpStatus;
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

    @GetMapping("/getPersonalId")
    public ResponseEntity<Person> getPersonByPersonalId(@RequestParam("personalId") String personalId) {
        Optional<Person> person = personRepository.findByPersonalId(personalId);
        return person.isPresent()? ResponseEntity.ok(person.get()) : ResponseEntity.notFound().build();
    }

    @GetMapping("/getLocation")
    public ResponseEntity<Person> getPersonByPersonalId(@RequestParam("location") Location location) {
        Optional<Person> person = personRepository.findByLocation(location);
        return person.isPresent()? ResponseEntity.ok(person.get()) : ResponseEntity.notFound().build();
    }

    @GetMapping("/getAll")
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<Person> createPerson() {
        Person anotherPerson = new Person("999999999", "Alice Mckenzie", Location.REGISTRATION);
        return new ResponseEntity<>(personRepository.save(anotherPerson), HttpStatus.CREATED);
    }

}

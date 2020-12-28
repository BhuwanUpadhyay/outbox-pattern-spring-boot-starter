package com.example.demo.web;

import com.example.demo.domain.Person;
import com.example.demo.domain.PersonRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping("/persons")
    public ResponseEntity<Person> create(@RequestBody @NotNull Person person) {
        return ResponseEntity.ok(personRepository.save(person));
    }

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> list() {
        return ResponseEntity.ok(personRepository.findAll());
    }
}
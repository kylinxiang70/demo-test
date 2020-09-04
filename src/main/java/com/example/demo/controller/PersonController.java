package com.example.demo.controller;

import com.example.demo.entites.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PersonController {

    @GetMapping("/persons")
    public Person getPerson() {
        Map<Person, String> map = new HashMap<>();
        Person person = new Person(10, "hehe");
        map.put(person, "hehe");
        System.out.println(person);
        return person;
    }
}

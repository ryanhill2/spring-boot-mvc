package com.example.demo.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PersonController {
    @Autowired
    public PersonService personService;

    @GetMapping("/person")
    public List<Person> findAllPeople(){
        return personService.findAllPeople();
    }

    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }
}

package com.cpbalance.cpbalancebackend.person;

import com.cpbalance.cpbalancebackend.exception.InternalErrorException;
import com.cpbalance.cpbalancebackend.exception.NoContentException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private PersonService personService;
    private PersonRepository personRepository;

    public PersonController(PersonService personService, PersonRepository personRepository){
        this.personService = personService;
        this.personRepository = personRepository;
    }

    @GetMapping("/person")
    public List<Person> listAll(){
        return personRepository.findAll();
    }

    @GetMapping("/person/{id}")
    public Person findById(@PathVariable Long id) {
        return personRepository.findById(id).orElseThrow(NoContentException::new);
    }

    @PostMapping("/person")
    public void add(@RequestBody PersonTO person){
        personService.add(person);
    }
}

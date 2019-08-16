package com.cpbalance.cpbalancebackend.person;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public void add(PersonTO personTO){
        Person newPerson = new Person();
        newPerson.setName(personTO.getName());

        personRepository.save(newPerson);
    }
}

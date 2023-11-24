package com.example.backendmeddb.config;

import com.example.backendmeddb.model.Person;
import com.example.backendmeddb.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InitData implements CommandLineRunner {
    @Autowired
    PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person();
        person.setName("Thomas");
        person.setBirthdate(LocalDate.now());
        personRepository.save(person);
    }
}

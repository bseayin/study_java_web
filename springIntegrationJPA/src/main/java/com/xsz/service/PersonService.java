package com.xsz.service;

import java.util.List;


import com.xsz.domain.Person;
import org.springframework.messaging.handler.annotation.Payload;

/**
 * The Service is used to create Person instance in database
 *
 * @author Amol Nayak
 * @author Gunnar Hillert
 *
 */
public interface PersonService {

    /**
     * Creates a {@link Person} instance from the {@link Person} instance passed
     *
     * @param person created person instance, it will contain the generated primary key and the formated name
     * @return The persisted Entity
     */
    Person createPerson(Person person);

    /**
     *
     * @return the matching {@link Person} record(s)
     */
    @Payload("new java.util.Date()")
    List<Person> findPeople();

}
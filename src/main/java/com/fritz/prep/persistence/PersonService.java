package com.fritz.prep.persistence;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class PersonService {

    @PersistenceContext
    private final EntityManager entityManager;

    public PersonService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public PersonEntity create(PersonEntity person) {
        entityManager.persist(person);
        return person;
    }
}

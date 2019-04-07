package com.uis.spring.jpa.service;

import java.util.List;

import com.uis.spring.jpa.demo.Person;

public interface PersonService {

    /**
     * Creates a new person.
     * @param created   The information of the created person.
     * @return  The created person.
     */
    public Person create(Person created);

    /**
     * Deletes a person.
     * @param personId  The id of the deleted person.
     * @return  The deleted person.
     * @throws Exception  if no person is found with the given id.
     */
    public Person delete(Integer personId) throws Exception;

    /**
     * Finds all persons.
     * @return  A list of persons.
     */
    public List<Person> findAll();

    /**
     * Finds person by id.
     * @param id    The id of the wanted person.
     * @return  The found person. If no person is found, this method returns null.
     */
    public Person findById(Integer id);
    
    public List<Person> findByPersonName(String name);
    
    public List<Person> findByPersonsGPid(Integer pid);
    
    public List<Person> findPersonByCity(String city);
}

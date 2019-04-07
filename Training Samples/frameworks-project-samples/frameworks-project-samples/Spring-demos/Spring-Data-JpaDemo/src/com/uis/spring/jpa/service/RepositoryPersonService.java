package com.uis.spring.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uis.spring.jpa.demo.Person;
import com.uis.spring.jpa.demo.PersonRepository;

@Service(value="personService")
public class RepositoryPersonService implements PersonService {
    
    
    @Autowired
    private PersonRepository personRepository;

    @Transactional
    @Override
    public Person create(Person person) {
        System.out.println("Creating a new person with information: " + person);
        return personRepository.save(person);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Person delete(Integer personId) throws Exception {
        System.out.println("Deleting person with id: " + personId);
        
        Person deleted = personRepository.findOne(personId);
        
        if (deleted == null) {
            System.out.println("No person found with id: " + personId);
            throw new Exception();
        }
        
        personRepository.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Person> findAll() {
        System.out.println("Finding all persons");
        return personRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Person findById(Integer id) {
        System.out.println("Finding person by id: " + id);
        return personRepository.findOne(id);
    }

    /**
     * This setter method should be used only by unit tests.
     * @param personRepository
     */
    protected void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

	@Override
	public List<Person> findByPersonName(String name) {
		System.out.println("Finding the person Object by Name "+name);
		return personRepository.findByName(name);
	}

	@Override
	public List<Person> findByPersonsGPid(Integer pid) {
		System.out.println("Finding Persons Greater than give Pid "+pid+"\n\n\n");
		return personRepository.findByGreaterPid(pid);
	}

	@Override
	public List<Person> findPersonByCity(String city) {
		// TODO Auto-generated method stub
		return personRepository.findByCity(city);
	}
}

package com.uis.spring.jpa.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface PersonRepository extends JpaRepository<Person, Integer> {
	public List<Person> findByName(String name);
	public Person findBySsn(String ssn);
	public List<Person> findByCity(String city);
	@Query("SELECT p FROM Person p WHERE p.pid > ?1")
	public List<Person> findByGreaterPid(Integer pid);
}

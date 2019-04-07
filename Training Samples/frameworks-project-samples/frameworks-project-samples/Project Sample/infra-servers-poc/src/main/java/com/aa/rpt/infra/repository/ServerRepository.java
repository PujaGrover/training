package com.aa.rpt.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aa.rpt.infra.model.Servers;

public interface ServerRepository extends JpaRepository<Servers, Integer> {

}

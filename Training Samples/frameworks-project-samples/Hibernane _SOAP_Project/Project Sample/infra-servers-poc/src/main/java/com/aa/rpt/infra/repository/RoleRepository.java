package com.aa.rpt.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aa.rpt.infra.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}

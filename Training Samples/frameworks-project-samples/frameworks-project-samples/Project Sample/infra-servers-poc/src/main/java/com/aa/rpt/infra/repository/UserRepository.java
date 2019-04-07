package com.aa.rpt.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aa.rpt.infra.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

package com.sageit.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sageit.springboot.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, String> {

}

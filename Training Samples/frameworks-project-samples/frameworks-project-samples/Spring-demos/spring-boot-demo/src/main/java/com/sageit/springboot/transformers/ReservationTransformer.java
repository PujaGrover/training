package com.sageit.springboot.transformers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sageit.springboot.domain.Reservation;
import com.sageit.springboot.vo.ReservationVO;

@Component
public class ReservationTransformer {
	
	public ReservationVO convertToReservationVO(Reservation reservation){
		ReservationVO vo = new ReservationVO();
		if(reservation!=null){
		vo.setPnr(reservation.getPnr());
		vo.setDepartureDate(reservation.getDepartureDate());
		vo.setDestination(reservation.getDestination());
		vo.setOrigin(reservation.getOrigin());
		vo.setReturnDate(reservation.getReturnDate());
		vo.setTripType(reservation.getTripType());
		}
		return vo;
	}
	
	public Reservation convertToReservation(ReservationVO vo){
		Reservation reservation = new Reservation();
		if(vo!=null){
			reservation.setPnr(vo.getPnr());
			reservation.setDepartureDate(vo.getDepartureDate());
			reservation.setDestination(vo.getDestination());
			reservation.setOrigin(vo.getOrigin());
			reservation.setReturnDate(vo.getReturnDate());
			reservation.setTripType(vo.getTripType());
		}
		return reservation;
	}
	
	public List<Reservation> convertToReservationList(List<ReservationVO> voList){
		List<Reservation> reservations = new ArrayList<>();
		for(ReservationVO vo : voList){
			reservations.add(convertToReservation(vo));
		}
		return reservations;
	}

	public List<ReservationVO> convertToReservationVOList(List<Reservation> reservations){
		List<ReservationVO> reservationVOs= new ArrayList<>();
		for(Reservation  reservation : reservations){
			reservationVOs.add(convertToReservationVO(reservation));
		}
		return reservationVOs;
	}
}

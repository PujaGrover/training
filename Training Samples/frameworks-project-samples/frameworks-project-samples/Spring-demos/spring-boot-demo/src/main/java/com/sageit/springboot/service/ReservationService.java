package com.sageit.springboot.service;

import java.util.List;

import com.sageit.springboot.vo.ReservationVO;

public interface ReservationService {
	public List<ReservationVO> getAllReservations();
	public ReservationVO getReservationById(String pnr);
	public ReservationVO saveReservation(ReservationVO reservationVO);
}

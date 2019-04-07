package com.sageit.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sageit.springboot.domain.Reservation;
import com.sageit.springboot.repository.ReservationRepository;
import com.sageit.springboot.transformers.ReservationTransformer;
import com.sageit.springboot.vo.ReservationVO;

@Service("reservationService")
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	private ReservationTransformer reservationTransformer;
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	@Override
	@Transactional
	public List<ReservationVO> getAllReservations() {
		List<ReservationVO> reservationVOs=reservationTransformer.convertToReservationVOList(reservationRepository.findAll());
		return reservationVOs;
	}

	@Override
	public ReservationVO getReservationById(String pnr) {
		ReservationVO vo  = reservationTransformer.convertToReservationVO(reservationRepository.findOne(pnr));
		return vo;
	}

	@Override
	public ReservationVO saveReservation(ReservationVO reservationVO) {
		Reservation reservation = reservationTransformer.convertToReservation(reservationVO);
		Reservation dbReservation = reservationRepository.save(reservation);
		return reservationTransformer.convertToReservationVO(dbReservation);
	}

}

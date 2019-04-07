package com.sageit.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sageit.springboot.service.ReservationService;
import com.sageit.springboot.vo.ReservationVO;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public  List<ReservationVO> getAllReservations(){
		return reservationService.getAllReservations();
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public  ReservationVO getAllReservations(@RequestBody ReservationVO reservationVO){
		return reservationService.saveReservation(reservationVO);
	}
	
	@RequestMapping(value="/{pnr}",method=RequestMethod.GET)
	public  ReservationVO getReservation(@PathVariable(name="pnr") String pnr){
		return reservationService.getReservationById(pnr);
	}
}

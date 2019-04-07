package com.sageit.springboot.vo;

import java.io.Serializable;
import java.util.Date;

public class ReservationVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -350520308281058878L;
	private String pnr;
	private String origin;
	private String destination;
	private Date departureDate;
	private Date returnDate;
	private String tripType;
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getTripType() {
		return tripType;
	}
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

}

package com.example.Model;

import java.util.Date;


public class FlightDetailsTO {
	

		int flightNo;
		String airline;
		double durationInMin;
		String source;
		String destination;
		SeatTO seatNo ;

		Date dateTime;
		String status;
		String gate;
		public int getFlightNo() {
			return flightNo;
		}
		public void setFlightNo(int flightNo) {
			this.flightNo = flightNo;
		}
		public String getAirline() {
			return airline;
		}
		public void setAirline(String airline) {
			this.airline = airline;
		}
		public double getDurationInMin() {
			return durationInMin;
		}
		public void setDurationInMin(double durationInMin) {
			this.durationInMin = durationInMin;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public SeatTO getSeatNo() {
			return seatNo;
		}
		public void setSeatNo(SeatTO seatNo) {
			this.seatNo = seatNo;
		}
		public Date getDateTime() {
			return dateTime;
		}
		public void setDateTime(Date dateTime) {
			this.dateTime = dateTime;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getGate() {
			return gate;
		}
		public void setGate(String gate) {
			this.gate = gate;
		}
		
	

}

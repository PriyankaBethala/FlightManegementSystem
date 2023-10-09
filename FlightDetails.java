package com.RestApiProject.model;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import jakarta.persistence.Table;
@Entity
@Table(name="flight_details")
@DynamicUpdate
public class FlightDetails {
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="row_no")
//		@JsonProperty("flightid")
		private int id;
		

		
		@Column(name="domestic_flight")
		private Boolean isDomestic;
		
		@Column(name="flight_number" , length=6)
		private String flightNumber;
		
		@Column(name="flight_name", length=20)
		private String flightName;
		
		@Column(name="departure_city",nullable = false)
		private String departureCity;
		
		@Column(name="arrival_city", nullable = false )
		private String arrivalCity;

		@Column(name="ticket_cost")
		private Integer ticketCost;
		
		@Column(name="flight_Rating")
		private Integer flightRating;
		
		@Column(name="laguage_weight")
		private int laguageWeight;
		

//		@ManyToOne
//		private FlightCompany CompanyName;
//		
//		public FlightCompany getCompanyName() {
//			return CompanyName;
//		}
//
//		public void setCompanyName(FlightCompany CompanyName) {
//			this.CompanyName = CompanyName;
//		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Boolean getIsDomestic() {
			return isDomestic;
		}

		public void setIsDomestic(Boolean isDomestic) {
			this.isDomestic = isDomestic;
		}

		public String getFlightNumber() {
			return flightNumber;
		}

		public void setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
		}

		public String getFlightName() {
			return flightName;
		}

		public void setFlightName(String flightName) {
			this.flightName = flightName;
		}

		public String getDepartureCity() {
			return departureCity;
		}

		public void setDepartureCity(String departureCity) {
			this.departureCity = departureCity;
		}

		public String getArrivalCity() {
			return arrivalCity;
		}

		public void setArrivalCity(String arrivalCity) {
			this.arrivalCity = arrivalCity;
		}

		public Integer getTicketCost() {
			return ticketCost;
		}

		public void setTicketCost(Integer ticketCost) {
			this.ticketCost = ticketCost;
		}

		public Integer getFlightRating() {
			return flightRating;
		}

		public void setFlightRating(Integer flightRating) {
			this.flightRating = flightRating;
		}

		public int getLaguageWeight() {
			return laguageWeight;
		}

		public void setLaguageWeight(int laguageWeight) {
			this.laguageWeight = laguageWeight;
		}

		
		@Override
		public String toString() {
			return "FlightDetails [id=" + id + ", isDomestic=" + isDomestic + ", flightNumber=" + flightNumber
					+ ", flightName=" + flightName + ", departureCity=" + departureCity + ", arrivalCity=" + arrivalCity
					+ ", ticketCost=" + ticketCost + ", flightRating=" + flightRating + ", laguageWeight="
					+ laguageWeight + "]";
		}
}





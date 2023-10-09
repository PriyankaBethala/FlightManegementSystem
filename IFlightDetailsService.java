package com.RestApiProject.IServices;

import java.util.List;

import org.springframework.stereotype.Service;

import com.RestApiProject.model.FlightDetails;

@Service
public interface IFlightDetailsService {
	

	    
		void deleteFlightDetailsById(int id);
		FlightDetails getDetailsById(int id);
		List<FlightDetails> getAllFlightDetails();
		void deleteFlightDetails();
		FlightDetails createFlightDetails(FlightDetails flightObj);
		 		
		
        List<FlightDetails> searchByFlightName(String flightName);
		
		List<FlightDetails> sortByTicketCost(String direction, String flightName);
		List<FlightDetails> sortByFlightRating(String direction, String filghtName);
	    FlightDetails updateDetailsUsingId(FlightDetails flightObj,int id);
	    List<FlightDetails> searchByDepartureCityAndArrivalCity(String departureCity,String arrivalCity);
		List<FlightDetails> checkIfFlightIsDomestic(Boolean booleanObj);

		
}

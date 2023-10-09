package com.RestApiProject.Repository;
import java.util.List;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RestApiProject.model.FlightDetails;



@Repository
public interface FlightDetailsRepository  extends JpaRepository<FlightDetails,Integer> {

	List<FlightDetails> findByIsDomestic(Boolean booleanObj);
	List<FlightDetails> findByFlightNameContainingIgnoreCase(String flightName);
	List<FlightDetails> findByDepartureCityAndArrivalCity(String departureCity,String arrivalCity);



	
	
}
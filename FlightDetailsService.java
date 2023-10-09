package com.RestApiProject.Services;



/*import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.RestApiProject.IServices.IFlightDetailsService;
import com.RestApiProject.Repository.FlightDetailsRepository;
import com.RestApiProject.model.FlightDetails;

@Service
public class FLightDetailsService implements IFlightDetailsService {
	
	private FlightDetailsRepository flightDetailsRepository;
	
	public FLightDetailsService(FlightDetailsRepository FlightDetailsRepository) {
		flightDetailsRepository = FlightDetailsRepository;
	}

	@Override
	public FlightDetails createFlightDetails(FlightDetails flt) {
		return this.flightDetailsRepository.save(flt);
	}

	@Override
	public List<FlightDetails> getAllFlightDetails() {
		return this.flightDetailsRepository.findAll();
	}

	@Override
	public FlightDetails updateFlightDetailsById(FlightDetails flt, int flightId) {
		Optional<FlightDetails> flight = flightDetailsRepository.findById(flightId);
		
		if(flight.isPresent()) {
			FlightDetails existingflight = flight.get();
			existingflight.setTicketCost(flt.getTicketCost());
			existingflight.setSource(flt.getSource());
			existingflight.setDestination(flt.getDestination());
			existingflight.setIsCommercial(flt.getIsCommercial());
			flightDetailsRepository.save(existingflight);
			return existingflight;
		}
		return null;
	}
	

	@Override
	public FlightDetails getFlightDetailsById(int flightid) {
		Optional<FlightDetails> flt =flightDetailsRepository .findById(flightid);  //null , or it can 5tg person rec
		if(flt.isPresent()) {
			return flt.get();
		}
		else {
			return null;
		}
	}

	@Override
	public void deleteflightById(int flightId) {
		Optional<FlightDetails> flt = flightDetailsRepository.findById(flightId);
		if(flt.isPresent()) {
			flightDetailsRepository.deleteById(flightId);
		}	
	}
	}


	
	*/
	

	


	/*@Override
	public FlightDetails createEmployee(FlightDetails emp) {
		return	this.employeeRepository.save(emp);
	}

	@Override
	public List<FlightDetails> getAllEmployees() {
		return this.employeeRepository.findAll();
	}
}
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.RestApiProject.IServices.IFlightDetailsService;
import com.RestApiProject.Repository.FlightDetailsRepository;
import com.RestApiProject.model.FlightDetails;


@Service
public class FlightDetailsService implements IFlightDetailsService {

	
	private FlightDetailsRepository flightDetailsRepository;
	
    @Autowired
	public FlightDetailsService(FlightDetailsRepository flightDetailsRepository) {
		this.flightDetailsRepository=flightDetailsRepository;
	}
	@Override
	public FlightDetails createFlightDetails(FlightDetails flightObj) {
		return flightDetailsRepository.save(flightObj);
	}

	@Override
	public  FlightDetails  updateDetailsUsingId( FlightDetails flightObj,int id) {
		Optional<FlightDetails> flightDetailsFromDb = flightDetailsRepository.findById(id); 
if(flightDetailsFromDb.isPresent()) {
	FlightDetails existingFlightDetails=flightDetailsFromDb.get();
	existingFlightDetails.setDepartureCity(flightObj.getDepartureCity());
	existingFlightDetails.setArrivalCity(flightObj.getArrivalCity());
	existingFlightDetails.setTicketCost(flightObj.getTicketCost());
	existingFlightDetails.setFlightName(flightObj.getFlightName());
	existingFlightDetails.setFlightNumber(flightObj.getFlightNumber());
	existingFlightDetails.setLaguageWeight(flightObj.getLaguageWeight());
	existingFlightDetails.setFlightRating(flightObj.getFlightRating());
	existingFlightDetails.setIsDomestic(flightObj.getIsDomestic());
	flightDetailsRepository.save(existingFlightDetails);
	return existingFlightDetails;
	}
else {
	return null;
}
}

	
	@Override
	public List<FlightDetails> getAllFlightDetails() {
		return flightDetailsRepository.findAll();
	}
	
	
	
	@Override
	public FlightDetails getDetailsById(int id) {
			Optional<FlightDetails> flightObj = flightDetailsRepository.findById(id);  //null , or it can 5tg person rec
			if(flightObj.isPresent()) {
				return flightObj.get();
			}
			else {
				return null;
			}
	}
	@Override
	public void deleteFlightDetailsById(int id) {
		Optional<FlightDetails> flightObj = flightDetailsRepository.findById(id);  //null , or it can 5tg person rec
		if(flightObj.isPresent()) {
			flightDetailsRepository.deleteById(id);
		}
	}
	@Override
	public void deleteFlightDetails() {
		flightDetailsRepository.deleteAll();
	}
	@Override
	public List<FlightDetails> checkIfFlightIsDomestic(Boolean booleanObj )  {
		
			List<FlightDetails> flightObj= flightDetailsRepository.findByIsDomestic(true);
			return flightObj;
	}
	@Override
	public List<FlightDetails> searchByFlightName(String flightName) {
		return flightDetailsRepository.findByFlightNameContainingIgnoreCase(flightName);

	}
	@Override
	public List<FlightDetails> searchByDepartureCityAndArrivalCity(String departureCity, String arrivalCity) {
		return flightDetailsRepository.findByDepartureCityAndArrivalCity(departureCity,arrivalCity);

	}
	private Sort.Direction getSortDirection(String direction){
		if (direction.equals("asc")) {
			return Sort.Direction.ASC;
		}else if(direction.equals("desc")) {
			return Sort.Direction.DESC;
			}
		return Sort.Direction.ASC;
	}
	
public List<FlightDetails> sortByTicketCost(String direction, String fieldName) {
		
		List<FlightDetails> flightObj=new ArrayList<FlightDetails>();
		flightObj=flightDetailsRepository.findAll(Sort.by(getSortDirection(direction),fieldName));
		return flightObj;
		
	}
    @Override
public List<FlightDetails> sortByFlightRating(String direction, String fieldName) {
    	List<FlightDetails> flightObj=new ArrayList<FlightDetails>();
		flightObj=flightDetailsRepository.findAll(Sort.by(getSortDirection(direction),fieldName));
		return flightObj;
    }
	
	}	
	




package Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import Model.FlightDetailsTO;
import Model.FlightList;

@RestController

@RequestMapping(value = "/")
public class ClientController {

	public RestTemplate restTemplate;

	@RequestMapping(value = "/allFlight", method = RequestMethod.GET)
	  public FlightList getAirLineDetail(){
		  
		  final String uri = "http://localhost:8080/base/getFlight";
		     
		    
		    HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		     
		    ResponseEntity<FlightList> result = (ResponseEntity<FlightList>) restTemplate.exchange(uri, HttpMethod.GET, entity, FlightList.class);
		    
		    FlightList   flightList = result.getBody();
		    
		    return flightList;
		     
	  }
	
	@RequestMapping(value = "/getFlightStatus", method = RequestMethod.GET)
	 public FlightList showFlightStatus(){
		  
		  final String uri = "http://localhost:8080/base/getFlightStatus";
		     
		    
		    HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		     
		     
		    ResponseEntity<FlightList> result = (ResponseEntity<FlightList>) restTemplate.exchange(uri, HttpMethod.GET, entity, FlightList.class);
		    
		    FlightList   flightList = result.getBody();
		    
		    return flightList;
		    
		     
	  }
	
	@RequestMapping(value = "/getSeatNo", method = RequestMethod.GET)
	 
	 public FlightDetailsTO showSeatDetail(){
		  
		  final String uri = "http://localhost:8080/base/getFlight/123";
		     
		    
		    HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		     
		    ResponseEntity<FlightDetailsTO> result = (ResponseEntity<FlightDetailsTO>) restTemplate.exchange(uri, HttpMethod.GET, entity, FlightDetailsTO.class);
		     
		    
		    return result.getBody();
		     
	  }

}

package Controller;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

@RequestMapping(value = "/")
public class ClientController {

	public RestTemplate restTemplate;

	@RequestMapping(value = "/allFlight", method = RequestMethod.GET)
	  public <T> ResponseEntity<T> getAirLineDetail(){
		  
		  final String uri = "http://localhost:8080/base/getFlight";
		     
		    
		    HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		     
		    ResponseEntity<T> result = (ResponseEntity<T>) restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
		     
		    
		    return result;
		     
	  }
	
	@RequestMapping(value = "/getFlightStatus", method = RequestMethod.GET)
	 public <T> ResponseEntity<T> showFlightStatus(){
		  
		  final String uri = "http://localhost:8080/base/getFlightStatus";
		     
		    
		    HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		     
		    ResponseEntity<T> result = (ResponseEntity<T>) restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
		     
		    
		    return result;
		     
	  }
	
	@RequestMapping(value = "/getSeatNo", method = RequestMethod.GET)
	 
	 public <T> ResponseEntity<T> showSeatDetail(){
		  
		  final String uri = "http://localhost:8080/base/getFlight/123";
		     
		    
		    HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		     
		    ResponseEntity<T> result = (ResponseEntity<T>) restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
		     
		    
		    return result;
		     
	  }

}

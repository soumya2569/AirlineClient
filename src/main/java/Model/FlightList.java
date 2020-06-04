package Model;

import java.util.List;

public class FlightList {
	    
	private List<FlightDetailsTO> flightList;
	
	public List<FlightDetailsTO> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<FlightDetailsTO> flightList) {
		this.flightList = flightList;
	}

	

	public FlightList(List<FlightDetailsTO> flightList) {
		super();
		this.flightList = flightList;
	}
	 
	   
	    // standard constructor and getter/setter
	
}

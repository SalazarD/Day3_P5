import java.util.ArrayList;
import java.util.HashSet;

public class FlightDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Flight> flights = new ArrayList<Flight>();
		
		flights.add(new Flight(1, "Southwest", "1", "cvg", "lax", 200));
		flights.add(new Flight(2, "Southwest", "2", "cvg", "lax", 300));
		flights.add(new Flight(3, "Southwest", "3", "pog", "lax", 100));
		
		ArrayList<Flight> result = getFlights(flights, "cvg", "lax");
		for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).toString());
		}
		
		System.out.println("This is the cheapest flight from cvg to lax: ");
		System.out.println(getCheapestFlight(flights,"cvg","lax").toString());
		
		System.out.println("Here are all flight going out of cvg: \n"); // print a blank line
		HashSet<Flight> matches = getAirlinesFlyingFrom(flights, "cvg");
		for (Flight match: matches) {
		System.out.println(match.toString());
		}
		
	}
	
	public static HashSet<Flight> getAirlinesFlyingFrom(ArrayList<Flight> flights, String source){
		
		HashSet<Flight> matches = new HashSet<Flight>();
		for (int i=0; i < flights.size(); i++) {
			if(flights.get(i).getSource().equalsIgnoreCase(source)) {
			matches.add(flights.get(i));
			}
			}
			return matches;
			}
		
		
		
		
	
	
	
	
	
	
	public static Flight getCheapestFlight(ArrayList<Flight> flights, String source, String destination){
		
		Flight cheapest = null;
		
		for(int i = 0; i < flights.size(); i ++) {
			Flight temp = flights.get(i);
			if((temp.getDestination().equalsIgnoreCase(destination) && temp.getSource().equalsIgnoreCase(source)) && (cheapest == null || cheapest.getPrice() > temp.getPrice())) {
				cheapest = temp;
			}
		}
		
		return cheapest;
	}
	
	public static ArrayList<Flight> getFlights(ArrayList<Flight> flights, String source, String destination){
		
		ArrayList<Flight> matches = new ArrayList<Flight>();
		
		for(int i = 0; i < flights.size(); i ++) {
			Flight temp = flights.get(i);
			if(temp.getDestination().equalsIgnoreCase(destination) && temp.getSource().equalsIgnoreCase(source)) {
				matches.add(temp);
			}
		}
		
		return matches;
		
	}

}

package in.barmans.mukesh.parkinglot.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ParkingLot {

	private List<Slot> availableSlots;
	private Map<Slot, Car> parkedCars;

	public ParkingLot() {
		availableSlots = new LinkedList<>();
		parkedCars = new HashMap<Slot, Car>();
	}

	public Slot getAvailableSlot() {
		if (availableSlots.size() > 0) {
			return availableSlots.remove(0);
		} else
			throw new RuntimeException("No slots available!");
	}
	
	public Ticket parkCar(Car car, Slot slot) {
		parkedCars.put(slot, car);
		Ticket ticket = new Ticket(slot, car);
		return ticket;
	}
	
	public Amount unparkCar(Ticket ticket){
		parkedCars.remove(ticket.getSlot());
		availableSlots.add(ticket.getSlot());
		return ticket.calculateCharge();
		
	}

}

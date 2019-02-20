package in.barmans.mukesh.parkinglot.model;

import java.time.LocalDateTime;

public class Ticket {
	private Car car;
	private Slot slot;
	private LocalDateTime time;

	public Ticket(Slot slot, Car car) {
		this.car = car;
		this.slot = slot;
		this.time = LocalDateTime.now();
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Slot getSlot() {
		return slot;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public Amount calculateCharge() {
		return new Amount();
		
	}

}

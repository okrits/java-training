package de.abas.training.java.arraylist;

public class ControlArrayList {

	public static void main(String[] args) {
		Fahrzeug vehicle = new Fahrzeug("2018_001", "black", 5.0, 100000.00);
		vehicle = new Fahrzeug("2018_001", "white", 5.2, 99000.00);
		vehicle.setVehicleSequenceNumber("");
		System.out.println(vehicle.toString());
	}

}
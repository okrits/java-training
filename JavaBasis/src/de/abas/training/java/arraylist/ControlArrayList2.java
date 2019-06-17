package de.abas.training.java.arraylist;

import java.util.ArrayList;

public class ControlArrayList2 {

	public static void main(String[] args) {
		ArrayList<Fahrzeug> vehicleList = new ArrayList<Fahrzeug>();

		vehicleList.add(new Fahrzeug("2019_001", "black", 4.5, 45000.00));
		vehicleList.add(new Fahrzeug("2019_002", "black", 4.8, 49000.00));
		vehicleList.add(new Fahrzeug("2019_003", "white", 4.9, 54500.00));
		vehicleList.add(new Fahrzeug("2019_004", "metallic-blue", 5.5, 90000.00));

		Fahrzeug newVehicle = new Fahrzeug("2019_003", "white", 4.9, 54500.00);
		if (vehicleList.contains(newVehicle)) {
			System.out.println("Vehicle " + newVehicle.getVehicleSequenceNumber() + " already exists.");
		} else {
			vehicleList.add(newVehicle);
		}

		for (Fahrzeug fahrzeug : vehicleList) {
			System.out.println(fahrzeug.toString());
		}
	}
}
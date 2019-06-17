package de.abas.training.java.treeset;

public class Fahrzeug implements Comparable<Fahrzeug> {
	private String vehicleSequenceNumber;
	private String color;
	private double length;
	private double salesPrice;

	public Fahrzeug() {
	}

	public Fahrzeug(String vehicleSequenceNumber, String color, double length, double salesPrice) {
		super();
		this.vehicleSequenceNumber = vehicleSequenceNumber;
		this.color = color;
		this.length = length;
		this.salesPrice = salesPrice;
	}

	public String getVehicleSequenceNumber() {
		return vehicleSequenceNumber;
	}

	public void setVehicleSequenceNumber(String vehicleSequenceNumber) {
		if (this.vehicleSequenceNumber.isEmpty()) {
			this.vehicleSequenceNumber = vehicleSequenceNumber;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equal = false;
		if (obj != null && this.getClass() == obj.getClass()) {
			Fahrzeug vehicle = (Fahrzeug) obj;
			equal = this.vehicleSequenceNumber.equals(vehicle.vehicleSequenceNumber);
		}
		return equal;
	}

	@Override
	public String toString() {
		return "[vehicleSequenceNumber=" + vehicleSequenceNumber + ", color=" + color + ", length=" + length
				+ ", salesPrice=" + salesPrice + "]";
	}

	@Override
	public int compareTo(Fahrzeug vehicle) {
		// aufsteigend
//		int compareTo = this.vehicleSequenceNumber.compareTo(vehicle.vehicleSequenceNumber);

		// absteigend
		int compareTo = vehicle.vehicleSequenceNumber.compareTo(this.vehicleSequenceNumber);

		// gleich?

		return compareTo;
	}
}
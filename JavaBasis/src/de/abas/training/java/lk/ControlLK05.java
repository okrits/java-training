package de.abas.training.java.lk;

public class ControlLK05 {

	public static void main(String[] args) {
		int zahl1 = 100;
		double zahl2 = 101.01;
		// implizite Typumwandlung
		zahl2 = zahl1;
		System.out.println(zahl1);
		System.out.println(zahl2 + "\n");

		int neueZahl = 99;
		// explizite Typumwandlung
		neueZahl = (int) zahl2;

		System.out.println(neueZahl);
	}
}
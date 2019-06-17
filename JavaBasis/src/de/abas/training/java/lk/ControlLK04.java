package de.abas.training.java.lk;

public class ControlLK04 {

	public static void main(String[] args) {
		Kunde kunde = new Kunde("Otto", "MÅller");
		Kunde abas = new Kunde("Otto", "MÅller");

		System.out.println(kunde.name + " " + kunde.nachname);
		System.out.println(abas.getNachname().equals(kunde.getNachname()));
		System.out.println(kunde.equals(abas));
	}
}
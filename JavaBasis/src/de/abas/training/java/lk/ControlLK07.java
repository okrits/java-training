package de.abas.training.java.lk;

public class ControlLK07 {

	public static void main(String[] args) {
		int index = 0;

		System.out.println("Index: " + index++ + " " + ++index);

		index += 3;

		System.out.println("Index: " + index++ + " " + ++index);

		// casten von Objekt-Variablen
		Kunde kunde = new Kunde("Max", "");
		System.out.println(kunde.name);

		Object obj = kunde;
		System.out.println("Object: " + obj);

		Class<? extends Object> class1 = obj.getClass();
		System.out.println(class1);

		if (obj instanceof Kunde) {
			kunde = (Kunde) obj;
			System.out.println(kunde.name);
		}
	}
}
package de.abas.training.java.treeset;

import java.util.TreeSet;

public class ControlTreeSet {

	public static void main(String[] args) {
		TreeSet<Fahrzeug> treeSet = new TreeSet<>();
		treeSet.add(new Fahrzeug("2019_003", "black", 4.5, 45000.00));
		treeSet.add(new Fahrzeug("2019_002", "black", 4.8, 49000.00));
		treeSet.add(new Fahrzeug("2019_001", "white", 4.9, 54500.00));
		treeSet.add(new Fahrzeug("2019_004", "metallic-blue", 5.5, 90000.00));

		for (Fahrzeug fahrzeug : treeSet) {
			System.out.println(fahrzeug.toString());
		}

	}
}
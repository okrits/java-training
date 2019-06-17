package de.abas.training.java.recursive;

public class ControlFakultaet {

	public static void main(String[] args) {
		MyMathUtils mathUtils = new MyMathUtils();
		long fakultaetVon = 50;
		long result = mathUtils.fakultaet(fakultaetVon);
		if (result <= Long.MAX_VALUE && result > 0) {
			System.out.println("Ergebnis: " + fakultaetVon + "!" + " = " + result);
		} else {
			System.out.println("Fehler");
		}
	}
}
package de.abas.training.java.pattern;

public class ControlPattern {

	public static void main(String[] args) {
		String ctryCode = "D";
		String zipCode = "10232";
		String reg = "0[1-9][0-9]{3}|[1-9][0-9]{4}";

		if ("CH".equals(ctryCode)) {
			if (!zipCode.matches("[1-9][0-9]{3}")) {
				System.out.println(zipCode + " prÅfen. Entspricht nicht dem schweizer (1234) Muster.");
			} else {
				System.out.println("Schweiz");
			}
		} else if ("D".equals(ctryCode)) {
			if (!zipCode.matches(reg)) {
				System.out.println(zipCode + " prÅfen. Entspricht nicht dem deutschen (12345) Muster.");
			} else {
				System.out.println("Deutschland");
			}
		}

	}

}
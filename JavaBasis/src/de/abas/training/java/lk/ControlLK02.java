package de.abas.training.java.lk;

/**
 * @author st1-07
 * 
 *         Lexikalische Konventionen
 * 
 */

public class ControlLK02 {

	/**
	 * Main Methode
	 * 
	 * @param args
	 */

	final static double MWST = 19.0;
	private static double netto = 50000;
	private static double brutto = 0;

	public static void main(String[] args) {
		// Konstanten

		// boolean bool = true;
		// String str = null;

		System.out.println("Netto = " + netto);
		System.out.println("Brutto = " + bruttoBeitrag(netto));
	}

	/**
	 * 
	 * @param netto
	 * @return Bruttobetrag
	 */
	private static double bruttoBeitrag(double netto) {
		brutto = netto + (netto * MWST / 100);
		return brutto;
	}
}
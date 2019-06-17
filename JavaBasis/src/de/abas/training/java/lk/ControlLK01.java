package de.abas.training.java.lk;

/**
 * @author st1-07
 * Lexikalische Konventionen
 * 
 */

public class ControlLK01 {

	public static void main(String[] args) {
		String str1 = "xyz";
		String str2 = "xyz ";
		if (str1.equals(str2)) {
			System.out.println(str1 + " gleich " + str2);
		} else {
			System.out.println(str2 + " ungleich " + str1);
		}
	}

}
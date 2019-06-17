package de.abas.training.java.bigdecimal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ControlBigDecimal {
	public static void main(String[] args) {
		String pathAndFile = "myfolder/files/customer/Fahrzeug.txt";

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathAndFile))) {

			String[] headLineValue = bufferedReader.readLine().split(";");
			String readLine = null;
			while ((readLine = bufferedReader.readLine()) != null) {
				String[] newLineValue = readLine.split(";");
				for (int i = 0; i < headLineValue.length; i++) {

					if (headLineValue[i].equals("salesPrice")) {
						System.out.println(headLineValue[i] + " = " + newLineValue[i]);
						BigDecimal newSalesPrice = calculateNewSalesPrice(newLineValue[i], "15%");
						BigDecimal oldSalesPrice = new BigDecimal(newLineValue[i]);
						System.out.println("Originalpreis: " + oldSalesPrice);
						System.out.println("Neuer Preis: " + newSalesPrice);
					}

				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // main

	private static BigDecimal calculateNewSalesPrice(String origSalesPrice, String salesPercent) {
		BigDecimal newSalesPrice = null;
		if (salesPercent.endsWith("%")) {
			String percentValue = salesPercent.substring(0, salesPercent.length() - 1);
//			System.out.println("Percent Value: " + percentValue);
			BigDecimal percent = new BigDecimal(percentValue);
			BigDecimal salesPrice = new BigDecimal(origSalesPrice);

			newSalesPrice = salesPrice.add(salesPrice.multiply(percent).divide(new BigDecimal(100))).setScale(2,
					RoundingMode.HALF_UP);
		}
		return newSalesPrice;
	}
} // class
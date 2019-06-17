package de.abas.training.java.file.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ControlReadFileNew {

	public static void main(String[] args) {
		String pathAndFile = "myfolder/files/customer/Fahrzeug.txt";

		BufferedReader bufferedReader = null;

		try {
			bufferedReader = new BufferedReader(new FileReader(pathAndFile));
			String[] headLineValue = bufferedReader.readLine().split(";");

			String readLine = null;
			while ((readLine = bufferedReader.readLine()) != null) {
				String[] newLineValue = readLine.split(";");
				for (int i = 0; i < headLineValue.length; i++) {
					System.out.println(headLineValue[i] + " = " + newLineValue[i]);
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// wird immer ausgefuehrt
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} // try-catch-finally
	} // main
} // class
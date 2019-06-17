package de.abas.training.java.file.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ControlReadFileTryWithResources {

	public static void main(String[] args) {
		String pathAndFile = "myfolder/files/customer/Fahrzeug.txt";

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathAndFile))) {

			String[] headLineValue = bufferedReader.readLine().split(";");
			String readLine = null;
			while ((readLine = bufferedReader.readLine()) != null) {
				String[] newLineValue = readLine.split(";");
				for (int i = 0; i < headLineValue.length; i++) {
					System.out.println(headLineValue[i] + " = " + newLineValue[i]);
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // main
} // class
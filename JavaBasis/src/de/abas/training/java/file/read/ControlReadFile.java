package de.abas.training.java.file.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ControlReadFile {

	public static void main(String[] args) {
		String pathAndFile = "myfolder/files/customer/Fahrzeug.txt";

		BufferedReader bufferedReader = null;

		try {
			bufferedReader = new BufferedReader(new FileReader(pathAndFile));
			String readLine = bufferedReader.readLine();
			// System.out.println(readLine);

			String[] fieldName = readLine.split(";");
			while ((readLine = bufferedReader.readLine()) != null) {
				String[] fieldValue = readLine.split(";");
				for (int i = 0; i < fieldName.length; i++) {
					System.out.println(fieldName[i] + " = " + fieldValue[i]);
				}
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
					// e.printStackTrace();
				}
			}
		}
	}
}
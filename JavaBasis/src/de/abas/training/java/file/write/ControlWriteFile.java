package de.abas.training.java.file.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ControlWriteFile {

	public static void main(String[] args) {
		String pathAndFile = "myfolder/files/customer/Fahrzeug.txt";
		BufferedWriter bufferedWrite = null;
		try {
			bufferedWrite = new BufferedWriter(new FileWriter(pathAndFile));

			String ausgabe = "";
			ausgabe = "vehicleSequenceNumer;color;length;salesPrice\n";
			bufferedWrite.write(ausgabe);
			ausgabe = "2019_001;red;5.7;120000.00\n";
			bufferedWrite.write(ausgabe);
			ausgabe = "2019_002:yellow;4.8;90000.00\n";
			bufferedWrite.write(ausgabe);

			System.out.println("Done.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (bufferedWrite != null) {
				try {
					bufferedWrite.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
					// e.printStackTrace();
				}
			}
		}
	}
}
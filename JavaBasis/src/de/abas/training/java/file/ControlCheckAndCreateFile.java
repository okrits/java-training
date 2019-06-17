package de.abas.training.java.file;

import java.io.File;
import java.io.IOException;

public class ControlCheckAndCreateFile {

	public static void main(String[] args) throws IOException {
		String pathAndFile = "myfolder/files/customer/Kunde.txt";

		File myFile = new File(pathAndFile);
		if (myFile.exists()) {
			System.out.println("File" + pathAndFile + " exists");
		} else {
			System.out.println("File\'" + pathAndFile + "\' don't exists and must be created");
			if (myFile.createNewFile()) {
				System.out.println("File " + pathAndFile + " created");
			} else {
				System.out.println("File " + pathAndFile + " was not created");
			}
		}
	}
}
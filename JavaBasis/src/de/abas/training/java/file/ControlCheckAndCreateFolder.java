package de.abas.training.java.file;

import java.io.File;

public class ControlCheckAndCreateFolder {

	public static void main(String[] args) {
		String folder = "myfolder";
		File directory = new File(folder);
		if (directory.exists()) {
			System.out.println("Directory " + folder + " exists");
		} else {
			System.out.println("Directory \'" + folder + "\' not exists and must be created");
			if (directory.mkdir()) {
				System.out.println("Directory " + folder + " created");
			} else {
				System.out.println("Directory " + folder + " was not created");
			}
		}
	}
}
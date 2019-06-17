package de.abas.training.java.file;

import java.io.File;

public class ControlCheckAndCreateFolderStructure {

	public static void main(String[] args) {
		String folderStructure = "myfolder/files/customer";

		File directories = new File(folderStructure);
		if (directories.exists()) {
			System.out.println("Directory structure" + folderStructure + " exists");
		} else {
			System.out.println("Directory structure\'" + folderStructure + "\' not exists and must be created");
			if (directories.mkdirs()) {
				System.out.println("Directory " + folderStructure + " created");
			} else {
				System.out.println("Directory " + folderStructure + " was not created");
			}
		}
	}
}
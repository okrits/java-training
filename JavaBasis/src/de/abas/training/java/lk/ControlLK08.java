package de.abas.training.java.lk;

import java.util.Random;

public class ControlLK08 {

	public static void main(String[] args) {
		Random random = new Random();
		int nextInt = random.nextInt(6) + 1;

		switch (nextInt) {
		case 1:
			System.out.println("sehr gut");
			break;
		case 2:
			System.out.println("gut");
			break;
		case 3:
			System.out.println("befriedigend");
			break;
		case 4:
			System.out.println("ausreichend");
			break;
		case 5:
			System.out.println("mangelhaft");
			break;
		case 6:
			System.out.println("ungengend");
			break;
		default:
			System.out.println("undefiniert");
			break;
		}

	}
}
package de.abas.training.java.array;

public class ControlArray {
//main
	public static void main(String[] args) {
		String[] arr = new String[2];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = "";
			System.out.println(arr[i]);
		}
		System.out.println();
		String[] arr2 = { "Porsche", "BMW", "Corvette" };
		for (String auto : arr2) {
			System.out.println(auto);
		}
	}

}

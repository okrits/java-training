package de.abas.training.java.string;

public class ControlString {

	public static void main(String[] args) {
		String[] arr = { "Meier", "Maier", "Mayer", "Meyer", "Meyr", "Mayr", "Melcher" };

		final String STARTS_WITH = "Me";
		final String ENDS_WITH = "er";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].startsWith(STARTS_WITH) || arr[i].endsWith(ENDS_WITH)) {
				System.out.println(arr[i]);
			}
		}

		String original = "Herzlich Willkommen zur Java-Grundlagen-Schulung";
		String subString = "Java";
		String replaceString = "AJO";

		System.out.println(original);
		String changed = original.replaceAll(subString, replaceString);
		System.out.println(changed);

		String upperCase = changed.toUpperCase();
		String lowerCase = changed.toLowerCase();
		System.out.println(upperCase + "\n" + lowerCase);

		char[] charArray = upperCase.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + " ");
		}
		System.out.println();

		String str = "Zug";
		String str2 = "-";
		String str3 = "spitz";
		String str4 = "Bahn";
		String concat = str.concat(str2).concat(str3).concat(str2).concat(str4);
		System.out.println(concat);
	}
}
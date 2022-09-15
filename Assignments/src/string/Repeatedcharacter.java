package string;

public class Repeatedcharacter {
	public static void main(String[] args) {

		String string1 = "kjhyuhjjkk";
		int count;

		char string[] = string1.toCharArray();
		System.out.println("Duplicate characters in a given string:");

		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					// set string[j] to 0 avoid printing visited character
					string[j] = '0';
				}

			}

		}
	}

}
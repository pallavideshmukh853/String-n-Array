package string;

public class stringconcat1 {
	public static void main(String[] args) {
		String str1 = "pllavideshmukh";
		String str2 = "a";
		int index = 0;

		String s1 = new String();

		for (int i = 0; i < str1.length(); i++) {
			s1 = s1 + str1.charAt(i);
			if (i == index) {
				s1 = s1 + str2;
			}
		}
		System.out.println(s1);
	}

}



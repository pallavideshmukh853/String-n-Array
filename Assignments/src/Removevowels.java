
public class Removevowels {

	public static void main(String[] args) {
		String a = "appleaeiou";
		char result;
		char ch[] = a.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				result=ch[i];
			}
			else {
				System.out.println(ch[i]);

			}
		}
	}
}

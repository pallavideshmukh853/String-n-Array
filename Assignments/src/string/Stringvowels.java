package string;

public class Stringvowels {
	public static void main(String[] args) {
		Stringvowels rv=new Stringvowels();
        System.out.println(rv.removeVowels("yash technologies"));
        	
	}
	private String removeVowels(String str) {
        
        char[] charArray = str.toCharArray();
        String returnStr = "";
        
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
                    || charArray[i] == 'u') {
                charArray[i] = ' ';    
            }
        }
        for (char c : charArray) {
            if (c != ' ')
                returnStr += c;
        }
        return returnStr;
    }

}



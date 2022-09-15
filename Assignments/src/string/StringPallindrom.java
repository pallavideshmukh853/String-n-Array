package string;

public class StringPallindrom {
	  private static boolean isStringPallindrom(String string) {
	        String reverse = "";
	        for (int i = string.length() - 1; i >= 0; i--) {
	            reverse = reverse + string.charAt(i);
	        }
	        if (string.equals(reverse)) {
	            System.out.println(reverse);
	            return true;
	        } else {
	            return false;
	        }
	  }


	public static void main(String[] args){
		
		String []str= {"aba","yash"};
		 for (String string : str) {
	            if (StringPallindrom.isStringPallindrom(string)) {
	                continue;
	            }
	  
}
	}
}


package string;

public class SortingStringArray {
	public static void main(String[] args) {
		String str1[]= {"aditi","nishi","pooja","shubha","vedantiss"};
		
		String str2;
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1.length; j++) {
				if(i<j && str1[i].length()>str1[j].length()) {
					str2=str1[i];
					str1[i]=str1[j];
					str1[j]=str2;
				}
			}
		}
		  for (int i = 0; i < str1.length; i++) {
	            System.out.println(str1[i]);
	        }
	}

}



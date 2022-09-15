
public class numberofalphabetsrepeated {

	public static void main(String[] args) {
		String s = "pallavi";
		char ch[] =s.toCharArray();
		int count=0;
		for(int i = 0;i<ch.length;i++) {
			
			for(int j = i+1;j<=ch.length-1;j++) {
				if(ch[i]==ch[j]) {
					count=count+1;
				
					
				}	
			}
		System.out.println("number of alphabets repeated "+ch[i] + " is " + count);

	
}
}
	}

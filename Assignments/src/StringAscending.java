
public class StringAscending {

	public static void main(String[] args) {
		String str = "yash";
		char a[] = str.toCharArray();
		char temp;
		for(int i =0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("Ascending Order " +new String(a));	
		
		for(int i =0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
	}
}
}
		System.out.println("descending Order " +new String(a));	
	}
}
		
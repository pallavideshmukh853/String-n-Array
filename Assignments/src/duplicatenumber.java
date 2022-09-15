//WAP to find duplicate numbers and there counting from list of numbers.
public class duplicatenumber {
public static void main(String[] args) {
	int a[] = {1,2,3,4,5,6,6,7,2,1};
	int count=0;
	for(int i = 0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
				System.out.println(a[i]);

			}
	
		}

	}
	System.out.println(count);

	
}
}

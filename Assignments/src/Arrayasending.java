
//Ascending Array 
public class Arrayasending {
public static void main(String[] args) {
	int a[]= {11,12,13,16,19,15,22,20};
	int n = a.length;
	for(int i = 0;i<n/2;i++) {
		for(int j = i+1;j<n;j++) {
			
			if(a[i]>a[j]) {
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
		System.out.println(a[i]+" ");

	}
for(int i = 0;i<n/2+1;i++)
{
	for(int j = i;j<n;j++) {
		if(a[i]<a[j]) { 
			
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
	}
	System.out.println(a[i]+" ");
}
}
}

public class primenumber {
public static void main(String[] args) {
	int i=0;
	int num =0;
	String primenumber=" ";
	for(i=1;i<=100;i++) {
		
int count=0;
	for(num=i;num>=1;num--) {
		
	if(i%num==0) {
		count++;
		}
	
	}
	if(count==2) {
primenumber = primenumber+i+" ";	
	}

}
System.out.println(primenumber);
}
}

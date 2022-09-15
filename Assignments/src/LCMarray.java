
import java.util.Scanner;
public class LCMarray {
public static void main(String[] args) {
		int a, b, temp1, temp2, temp, HCF, LCM;
		Scanner sc = new Scanner(System.in);

		System.out.println("first Number: ");
		a = sc.nextInt();
		System.out.println("Second Number: ");
		b = sc.nextInt();
		sc.close();

		temp1 = a;
		temp2 = b;

		while (temp2 != 0) {
			temp = temp1;
			temp2 = temp1 % temp2;
			temp1 = temp;
		}

		HCF = temp1;
		LCM = (a * b) / HCF;

		System.out.println("HCF :" + HCF);
		System.out.println("LCM : " + LCM);
	}



}


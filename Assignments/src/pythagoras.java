
public class pythagoras {
public static void main(String[] args) {
	  int arr[] = { 3, 4, 5
			  };
      for (int i = 0; i < arr.length-2; i++) {
          for(int j=i+1;j<arr.length-1;j++) {
              for(int k=i+2;k<arr.length;k++) {
                  if(arr[i]*arr[i]+arr[j]*arr[j]==arr[k]*arr[k]) {
                      System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                  }
                  else {
                      System.out.println("not follows the Pythagoras concept ");
                  }
              }
          }
      }
}
}

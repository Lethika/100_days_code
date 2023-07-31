package p100days_code;

import java.util.Scanner;

public class big_no_array {
	public static void main(String args[]) {
		int n;
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("enter the elements in array");
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		
	}
		int nxt_big;
		for(int i=0;i<n;i++) {
			nxt_big= -1;
			for(int j=0;j<n;j++) {
				if(arr[j]>arr[i]&&(nxt_big==-1 ||arr[j]<nxt_big)) {
					nxt_big=arr[j];
				}
			}
		if(nxt_big==-1) {
			System.out.println(" ");
		}
		else {
			System.out.println(arr[i]+"->"+nxt_big);
		}
		}
		

}
}

package p100days_code;

import java.util.Scanner;

public class Left_rotate_array {
public static void rotate(int []arr,int n) {
	int temp = arr[0];
	for(int i=0;i<n-1;i++) {
		arr[i]=arr[i+1];
		
	}
	arr[n-1]=temp;
	for(int i=0;i<n;i++) {
	System.out.println(arr[i]+" ");
}
}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("enter the no of elements in array");
	n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("enter the elements in array");
	for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	
	}
	rotate(arr,n);
	
}
}


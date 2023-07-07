package p100days_code;

import java.util.Arrays;
import java.util.Scanner;

public class second_largest_array {
public static void main(String args[]) {
	int i,n;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the no of element");
	n = sc.nextInt();
	int []arr =new int[n];
	System.out.println("enter the elements into the array");
	for(i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	System.out.println(arr[n-2]);

}
}


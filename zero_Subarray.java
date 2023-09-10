package p100days_code;

public class subarray {
public static int zero_Subarray( int arr[]) {
	int max =0;
	for(int i=0;i<arr.length;i++) {
		int sum =0;
		for(int j=i;j<arr.length;j++) {
			sum += arr[j];
			if(sum == 0) {
			
			 max = Math.max(max, j-i+1);
			}
		}
	}
	return max;
}
public static void main(String args[]) {
	int arr[] = {9, -3, 3, -1, 6, -5};
	
	System.out.println("longest subarray with sum 0 is: "+zero_Subarray(arr));
}
}

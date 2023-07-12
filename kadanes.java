package p100days_code;
import java.util.*;


public class kadanes_algo {
	public static long subarray(int []arr,int n) {
		long maxi =Long.MIN_VALUE;
		long sum=0;
		int start=0;
		int startans = -1;
		int endans = -1;
		for(int i=0;i<n;i++) {
			if(sum==0)
				start=i;
			sum+=arr[i];
			if(sum>maxi) {
				maxi = sum;
				startans =start;
				endans = i;
			}
			if(sum<0) {
				sum=0;
			}
			
		}
		System.out.print("the subarray: [");
		for(int i= startans;i<endans;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		return maxi;
	}
	public static void main(String args[]) {
		
		int []arr= {-2,1,-3,4,-1,2,1,-5,4};
		int n=arr.length;
		long maxsum = subarray(arr,n);
		System.out.println("the maximum subarray is: "+maxsum);
	}

}

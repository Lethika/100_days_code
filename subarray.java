package p100days_code;

public class Sub_Array {
	public static int maxSubarraySum(int arr[],int n) {
		int maxi = Integer.MIN_VALUE;
		int i,j,sum;
		for(i=0;i<n;i++) {
			sum=0;
			for(j=i;j<n;j++) {
				sum+=arr[j];
				maxi =Math.max(maxi, sum);
			}
		}
		

		return n;
		
	}
	public static void main(String args[]) {
		int [] arr= {-1,2,-3,4,-1,2,1,-5,4};
		int n= arr.length;
		int maxsum= maxSubarraySum(arr,n);
		System.out.println("the maximum value in subarray is: "+maxsum);
	}

}

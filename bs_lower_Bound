package p100days_code;

public class Lower_bound_bs {
public static int lowerbound(int arr[],int n, int x) {
	int low =0;
	int high =n-1;
	int ans =n;
	while(low<=high) {
		int mid = (low+high)/2;
	if(arr[mid]>=x) {
		ans = mid;
		high = mid-1;
	}
	else {
		low = mid+1;
	}
	}
	
	return ans;
}
public static void main(String args[]) {
	int arr[]= {3,5,8,15,19};
	int n = arr.length;
	int x =9;
	int index = lowerbound(arr,n,x);
	System.out.println("the index of lowebound is:"+index);
}
}

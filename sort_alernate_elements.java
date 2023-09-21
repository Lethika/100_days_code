package p100days_code;
/*Write a program to sort the elements in odd positions in descending order and elements in
ascending order without using extra space input: 13,2,10,16,17,7,4,8*/
public class Arrange_array {
	public static void evenodd(int arr[],int n) {
	//even index
		for(int i=0;i<n;i+=2) {
			for(int j=i+2;j<n;j+=2) {//descending oder
			if(arr[j]>arr[i]) {
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
		}
		}
		//odd index
		for(int i=1;i<n;i+=2) {//ascending order
			for(int j=i+2;j<n;j+=2) {
				if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
			}
	}
		System.out.println("after arranging");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

}
	public static void main(String args[]) {
		int arr[]= {13,2,10,16,17,7,4,8};
		int n = arr.length;
		 evenodd(arr,n);
		
	}
	}

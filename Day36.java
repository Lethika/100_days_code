package p100days_code;

import java.util.Scanner;

public class array_sum {
	
		public static int third_elemet(int arr[]) {
			int tl= Integer.MIN_VALUE;
			int sl= Integer.MIN_VALUE;
			int l= Integer.MIN_VALUE;
			int small = Integer.MAX_VALUE;
			for(int num:arr) {
				if(num>l) {
					tl=sl;
					sl=l;
					l=num;
				}
				else if(num>sl&&num<l) {
					tl=sl;
					sl=num;
				}
				else if(num>tl&&num<sl) {
					tl=num;
				}
				if(num<small) {
					small=num;
				}
			}
			
			return tl+small;
			
		}
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int sum = third_elemet(arr);
			System.out.println("sum of the 3rd largest and smallest element in array is:"+sum);
		}

	}


	

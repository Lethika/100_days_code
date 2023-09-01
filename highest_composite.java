package p100days_code;

import java.util.Scanner;

public class Factors_cnt {
	static int factorcnt(int nums) {
		int cnt =0;
		for(int i=1;i<=nums;i++) {
			if(nums%i==0) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("start range");
		int start = sc.nextInt();
		System.out.println("end range");
		int end = sc.nextInt();
		sc.close();
		int maxfact =0;
		int composit =-1;
		for(int nums = start;nums<=end;nums++) {
			int factors = factorcnt(nums);
			if(factors>maxfact) {
				maxfact = factors;
				composit = nums;
			}
		}
		if(composit!=-1) {
			System.out.println("the highest composite that contains maximun factor is: "+composit);
		}
	}

}

package patten;

import java.util.Scanner;

public class Mirrorimg_corner {
	public static void main(String[] args) {
		int n ,i,j,s;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter n");
		n=sc.nextInt();
		for(i=0;i<n;i++) {
				
			for(s=0;s<i;s++)
				System.out.print("  ");
				for(j=0;j<n-i;j++)
					System.out.print("* ");
				System.out.println();
			}
				
		for(i=1;i<n;i++) {
		 for(s=0;s<n-i-1;s++)
			 System.out.print("  ");
		 for(j=0;j<i+1;j++)
			 System.out.print("* ");
		 System.out.println();
			
		}
	}
}

package patten;

import java.util.Scanner;

public class Upstar_downStar {
	public static void main(String args[]) {
		int i,j,n;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		 n=sc.nextInt();
		for(i=0;i<=n;i++) {
			for(j=-n;j<=n;j++)
				if(-(n-i)<j&&j<(n-i))
					System.out.print("  ");
				else
					System.out.print("* ");
				
			System.out.println();
			}
		}
}

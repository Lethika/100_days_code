package patten;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		int i,j,n,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		n = sc.nextInt();
		for(i=1;i<=n;i++) {
			for(s=1;s<=n-i;s++) 
				System.out.print("  ");
				for(j=1;j<=i*2-1;j++) 
					System.out.print("* ");
					System.out.println();

	}
		for( i=n-1;i>=1;i--) {
		for( s=1;s<=n-i;s++)
		System.out.print("  ");
		
		for( j=1;j<=i*2-1;j++)
		 
		
		System.out.print("* ");
		
		System.out.println();
		

	}

}
}

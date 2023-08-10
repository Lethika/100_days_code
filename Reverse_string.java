package p100days_code;

import java.util.Scanner;

public class Reverse_string {
	public static void reversestr(String str) {
		int n= str.length();
		char[] ch=str.toCharArray();
		char temp;
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			temp = ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		System.out.println(ch);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string to reverse");
		String str = sc.nextLine();
		
		reversestr(str);

	}

}

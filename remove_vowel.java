package p100days_code;

import java.util.Scanner;

public class Remove_vowels {
	public static String string(String str) {
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
				str=str.substring(0,i)+str.substring(i+1);
				i--;
			}
			
		}
		
		
		return str;
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		System.out.println("after removing vowels: \n"+string(str));
		
	}

}

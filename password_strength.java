package p100days_code;

import java.util.Scanner;

public class Pass_Strength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the password");
        String str = sc.nextLine();
        sc.close();
        int count = 0;

        if (str.length() >= 8) {
            count++;
        }

        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if ("!@#$%^&(),.".contains(String.valueOf(c))) {
                hasSpecialChar = true;
            }
        }

        if (hasLowerCase) {
            count++;
        }

        if (hasUpperCase) {
            count++;
        }

        if (hasDigit) {
            count++;
        }

        if (hasSpecialChar) {
            count++;
        }

        if (count == 1) {
            System.out.println("Weak");
        } else if (count == 2) {
            System.out.println("Medium");
        } else if (count == 3) {
            System.out.println("Good");
        } else if (count >= 4) {
            System.out.println("Strong");
        } else {
            System.out.println("Invalid");
        }
	
	 
 }
}

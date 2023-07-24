package Day1;
import java.util.Scanner;

public class palindrome_str_and_num {
    public static boolean isPalindromeString(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean isPalindromeNumber(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
    
    	
        String strInput = "radar";
        int numInput = 12321;

        if (isPalindromeString(strInput)) {
            System.out.println(strInput + " is a palindrome string.");
        } else {
            System.out.println(strInput + " is not a palindrome string.");
        }

        if (isPalindromeNumber(numInput)) {
            System.out.println(numInput + " is a palindrome number.");
        } else {
            System.out.println(numInput + " is not a palindrome number.");
        }
    }
}


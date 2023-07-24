package practice;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to check palindrome:");
		int a=sc.nextInt();int sum=0,r, temp=a;
		while(a>0) {
			r=a%10;
			sum=(sum*10)+r;
			a/=10;
			
		}
		if(temp==sum) {
			System.out.println(temp+ " is palindrome ");
		}
		else
			System.out.println(temp+" is not palindrome ");

	}

}

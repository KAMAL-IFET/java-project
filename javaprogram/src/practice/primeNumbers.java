package practice;

import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to check the prime:");
		int a=sc.nextInt();int flag=0;
		if(a==0||a==1) {
			System.out.println(a+"is not a prime number");}
		else {
			for(int i=2;i<=a/2;i++) {
				if(a%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				System.out.println(a+" is not a prime number");
			}
			else 
				System.out.println(a+"is a prime number");
		
	}}

}

package practice;

import java.util.Scanner;
import java.lang.Math;

public class armstrongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to check armstrong number");
		int a=sc.nextInt();
		int digits=0,r,sum=0,temp1=a;
		while(temp1>0) {
			temp1=temp1/10;
			digits++;
		}
		temp1=a;
		while(temp1>0) {
			r=temp1%10;
			sum+=(Math.pow(r,digits));
			temp1/=10;
			
			
		}
		if(a==sum) {
			System.out.println(a+" is armstrong");
		}
		else
			System.out.println(a+"is not armstrong");

	}

}

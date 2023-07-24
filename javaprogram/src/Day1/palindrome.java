package Day1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int num=sc.nextInt();
		int r,sum=0,temp;
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is a palindorme");
		}
		else {
			System.out.println(temp+" is not a palindrome");
		}

	}

}

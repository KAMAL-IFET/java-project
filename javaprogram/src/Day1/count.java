package Day1;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		int count=0;
		
		while(n!=0) {
			n=n/10;
			count++;
		}
		System.out.println("Number of Digits="+count);

	}

}

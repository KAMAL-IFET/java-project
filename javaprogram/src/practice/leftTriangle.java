package practice;

import java.util.Scanner;

public class leftTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=2*(n-i);j>=0;j--) {
				System.out.println(" ");}
				for(int k=0;k<=i;k++) {
					System.out.print("*");
					
				}
				System.out.println();}}}
				
	



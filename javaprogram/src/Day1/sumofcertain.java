package Day1;

import java.util.Scanner;

public class sumofcertain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the value of m:");
		int m= sc.nextInt();
		System.out.print("enter the value of n:");
		int n= sc.nextInt();
		System.out.print("enter the value of o:");
		int o =sc.nextInt();
		System.out.println("Results are");
		for(int i=m;i<=n;i++) {
			int c=i;
			int d=0,sum=0;
			while(c!=0) {
				d=c%10;
				sum=sum+d;
				c=c/10;
			}
			if(o==sum) {
				System.out.println(i);
			}
		}

	}

}

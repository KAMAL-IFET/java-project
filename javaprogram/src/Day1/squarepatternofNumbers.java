package Day1;
import java.util.Scanner;

public class squarepatternofNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n =sc.nextInt();
		int m=n,a =n;
		for(int i=1;i<=n;i++) {
			for( int j=1;j<=n;j++) {
				if(i==1)
					System.out.print(j);
				else if(i==n)
					System.out.print(m--);
				else if(j==1)
					System.out.print(i);
				else if(j==n)
					System.out.print(--a);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

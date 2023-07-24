package practice;
import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number upto whivh you need fibonacci series:");
		int a=sc.nextInt();
		int firstTerm=0;
		int secondTerm=1;
		System.out.print(firstTerm+ " "+secondTerm+" ");
		for(int i=2;i<a;i++) {
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			System.out.print(nextTerm+" ");
		}

	}

}

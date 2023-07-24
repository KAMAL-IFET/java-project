package Day1;
import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 System.out.print("enter the number:");
 		int a=sc.nextInt();
 		int firstterm=0,secondterm=1;
 		for(int i=0;i<=a;++i) {
 			System.out.print(firstterm+" ");
 			int nextterm=firstterm+secondterm;
 			firstterm=secondterm;
 			secondterm=nextterm;
 		}

	}

}

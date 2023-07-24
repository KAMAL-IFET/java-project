package Day1;
import java.util.Scanner;

public class prime_number {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number to check:");
	int num =sc.nextInt();
	int flag=0;
	if(num==0||num==1) {
		System.out.println(num+" is not a prime number");}
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			System.out.println(num+" is not a prime number");
			flag=1;
			break;
			
		}
	}
	if(flag==0) 
		System.out.println(num+" is a prime number");
	}
}
	
	
	

	
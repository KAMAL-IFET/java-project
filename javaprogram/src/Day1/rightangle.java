package Day1;
import java.util.Scanner;
public class rightangle {

	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		System.out.print("enter the numbers:");
		int n=a.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print("*");
			 System.out.println("");		
		}
           
		 	
	}
		
	

}

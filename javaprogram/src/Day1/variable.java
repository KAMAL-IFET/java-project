package Day1;
import java.util.Scanner;

public class variable {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println(" enter the number");
	int n=sc.nextInt();
	char var=65;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			   System.out.print(var);
			   }
		var++;
		
		System.out.println();
		
	}


	}

}

package Day1;
import java.util.Scanner;

public class returnString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String a=sc.nextLine();
		char c[]=a.toCharArray();
		for(int i=0;i<c.length;i+=2) {
			int t=c[i+1]-'0';  //49-48=1
			while(t-- >0)
			{
				System.out.print(c[i]);
			}
		}
		

	}

}

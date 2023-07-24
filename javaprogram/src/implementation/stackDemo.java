package implementation;

public class stackDemo {
	int s[]=new int[10];
	int top;
	stackDemo() {
		top=-1;
	}
	void push(int ele) {
		if(top==9) 
			System.out.println("stack is full")	;	
		else
		s[++top]=ele;
	}
	int pop() {
		if(top>=0)
		 return s[top--];
		else
			System.out.println("stack is empty");
		 return -1;
		 
	}

}

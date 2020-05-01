import java.util.*;
import java.io.*;

class Stack{
	int[] stack;
	int tos;
	int size;
	
	Stack(int sizeOfStack){
		size = sizeOfStack;
		stack = new int[sizeOfStack];
		tos = -1;
	}
	
	void push(int item){
		if(tos==(size-1)){
			System.out.println("----------------------");
			System.out.println("Stack over flow");
			System.out.println("----------------------");
		}
		else{
			stack[++tos] = item;
		}
	}
	
	int pop(){
		if(tos==-1){
			System.out.println("----------------------");
			System.out.println("Stack under flow");
			System.out.println("----------------------");
			return 0;
		}
		else{
			return stack[tos--];
		}
	}
}

class Main{
	public static void main(String args[])throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the stack: ");
		int size = sc.nextInt();
		Stack s = new Stack(size);
		int ter = 0, item;
		
		while(true){
			System.out.println();
			System.out.println("1) Push into stack");
			System.out.println("2) Pop from the stack");
			System.out.println("3) Display stack elements");
			System.out.println("4) Terminate program");
			
			int c = sc.nextInt();
			switch(c){
				case 1: System.out.println("enter integer type stack element: ");
						item = sc.nextInt();
						s.push(item);
				break;

				case 2: item = s.pop();
						System.out.printf("Item popped is: %d", item);
				break;
				
				case 3: for(int i=0;i<s.stack.length;i++){
							System.out.print(" "+s.stack[i]);
						}
				break;
				
				case 4: ter = 1;
				break;
				
				default: System.out.println("incorrect option choosen");
			}
			if(ter!=0){
				break;
			}
		}
	}
}
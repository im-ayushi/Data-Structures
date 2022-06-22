package com.nagarro.assignment.stack;
import java.util.*;

public class Main {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter maximum size of stack");
		int size=sc.nextInt();
		Stack stack = new Stack(size);
		
		System.out.println("Select the operation you want to perform in stack");
		System.out.println("1-Push");
		System.out.println("2-Pop");
		System.out.println("3-Peek");
		System.out.println("4-Contains");
		System.out.println("5-Size");
		System.out.println("6-Center");
		System.out.println("7-Sort");
		System.out.println("8-Reverse");
		System.out.println("9-Iterator");
		System.out.println("10-Traverse/print");
		String h="no";
		
		do{
			System.out.println("Enter Your Choice:");
			int m = sc.nextInt();
			switch (m) {
			case 1:
				System.out.println("ENTER THE DATA YOU WANT TO INSERT: ");
				int a = sc.nextInt();
				stack.push(stack,a);
				break;
			case 2:
				int value = stack.pop(stack);
				System.out.println("Value popped from stack: "+value);
				break;
			case 3:
				int value1 = stack.peek(stack);
				System.out.println("Value peeked from stack: "+value1);
				break;
			case 4:
				System.out.println("Enter the value you want to search");
				int u = sc.nextInt();
				boolean b;
				b=stack.contains(stack,u);
				if(b==true)
					System.out.println(u+" is present in the stack");
				else
					System.out.println(u+" is not present in the stack");
				break;
			case 5:
				int mx = stack.size(stack);
				System.out.println("Size of stack is: "+ mx);
				break;
			case 6:
				System.out.println("Middle element of stack is:"+stack.middle(stack));
				break;
			case 7:
				stack.sort(stack);
				break;
			case 8:
				stack.reverse(stack);
				break;
			case 9:
				int f,l;
				System.out.println("Enter starting and ending value:");
				f=sc.nextInt();
				l=sc.nextInt();
				stack.Iterate(f,l);
				break;
			case 10:
				stack.print(stack);
				break;
			default:
				System.out.println("Error");

			}
			System.out.println("Do you want to do any more operation in the Stack : yes/no");
			h = sc.next();
		}while(h.equals("yes"));
		sc.close();
		
		
	}
}

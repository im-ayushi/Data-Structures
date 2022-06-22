package com.nagarro.assignment.priorityQueue;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		priorityQueue pqueue = new priorityQueue();
		
		System.out.println("Select the operation you want to perform in priority queue:");
		System.out.println("1-Enqueue");
		System.out.println("2-Dequeue");
		System.out.println("3-Peek");
		System.out.println("4-Contains");
		System.out.println("5-Size");
		System.out.println("6-Reverse");
		System.out.println("7-Center");
		System.out.println("8-Iterator");
		System.out.println("9-Traverse/print");
		String h = "no";

		do {
			System.out.println("Enter Your Choice:");
			int m = sc.nextInt();
			switch (m) {
			case 1:
				System.out.println("ENTER THE DATA YOU WANT TO ENQUEUE: ");
				int a = sc.nextInt();
				pqueue.enqueue(pqueue, a);
				break;
			case 2:
				int value = pqueue.dequeue(pqueue);
				if (value != -1)
					System.out.println("Value after performing depqueue from priority queue: " + value);
				break;
			case 3:
				int data = pqueue.peek(pqueue);
				if (data != -1)
					System.out.println("Value after performing peek: " + data);
				break;
			case 4:
				System.out.println("Enter value:");
				int key = sc.nextInt();
				boolean data1 = pqueue.contains(pqueue, key);
				if (data1 == true)
					System.out.println(key + " is present in the priority queue");
				else
					System.out.println(key + " is not present in the priority queue");
				break;
			case 5:
				int mx = pqueue.size(pqueue);
				System.out.println("Size of pqueue is: " + mx);
				break;
			case 6:
				pqueue.reverse(pqueue);
				break;
			case 7:
				pqueue.center(pqueue);
				break;
			case 8:
				int f, l;
				System.out.println("Enter starting and ending value:");
				f = sc.nextInt();
				l = sc.nextInt();
				pqueue.iterate(pqueue,f, l);
				break;
			case 9:
				pqueue.print(pqueue);
				break;
			default:
				System.out.println("Error");

			}
			System.out.println("Do you want to do any more operation in the Priority Queue : yes/no");
			h = sc.next();
		} while (h.equals("yes"));
		sc.close();	
	}

}

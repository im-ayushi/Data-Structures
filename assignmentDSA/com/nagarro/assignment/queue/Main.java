package com.nagarro.assignment.queue;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maximum size of queue");
		int size = sc.nextInt();
		Queue queue = new Queue(size);

		System.out.println("Select the operation you want to perform in queue");
		System.out.println("1-Enqueue");
		System.out.println("2-Dequeue");
		System.out.println("3-Peek");
		System.out.println("4-Contains");
		System.out.println("5-Size");
		System.out.println("6-Center");
		System.out.println("7-Sort");
		System.out.println("8-Reverse");
		System.out.println("9-Iterator");
		System.out.println("10-Traverse/print");
		String h = "no";

		do {
			System.out.println("Enter Your Choice:");
			int m = sc.nextInt();
			switch (m) {
			case 1:
				System.out.println("ENTER THE DATA YOU WANT TO ENQUEUE: ");
				int a = sc.nextInt();
				queue.enqueue(queue, a);
				break;
			case 2:
				int value = queue.dequeue(queue);
				if (value != -1)
					System.out.println("Value after performing dequeue from queue: " + value);
				break;
			case 3:
				int data = queue.peek(queue);
				if (data != -1)
					System.out.println("Value after performing dequeue from queue: " + data);
				break;
			case 4:
				System.out.println("Enter value");
				int key = sc.nextInt();
				boolean data1 = queue.contains(queue, key);
				if (data1 == true)
					System.out.println(data1 + " is present in the queue");
				else
					System.out.println(data1 + " is not present in the queue");
				break;
			case 5:
				int mx = queue.size(queue);
				System.out.println("Size of queue is: " + mx);
				break;
			case 6:
				queue.middle(queue);
				break;
			case 7:
				queue.sort(queue);
				break;
			case 8:
				queue.reverse(queue);
				break;
			case 9:
				int f, l;
				System.out.println("Enter starting and ending value:");
				f = sc.nextInt();
				l = sc.nextInt();
				queue.Iterate(f, l);
				break;
			case 10:
				queue.print(queue);
				break;
			default:
				System.out.println("Error");

			}
			System.out.println("Do you want to do any more operation in the Queue : yes/no");
			h = sc.next();
		} while (h.equals("yes"));
		sc.close();
	}

}

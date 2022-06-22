package com.nagarro.assignment.linkedList;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList linklist = new LinkList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Select what you want to do in linked list");
		System.out.println("1-Insert a node");
		System.out.println("2-Insert a node in a specific position");
		System.out.println("3-Delete a node");
		System.out.println("4-Delete a node from a specific position");
		System.out.println("5-Find out the node at the center");
		System.out.println("6-Sort the linked list");
		System.out.println("7-Reverse a Linked list");
		System.out.println("8-Find out the size of the linked list");
		System.out.println("9-Iterator");
		System.out.println("10-Traverse/print the linked list");
		String h="no";
		
		do{
			System.out.println("Enter Your Choice");
			int m = sc.nextInt();
			switch (m) {
			case 1:
				System.out.println("ENTER THE DATA YOU WANT TO INPUT:- ");
				int a = sc.nextInt();
				linklist.insert(a);
				break;
			case 2:
				System.out.println("ENTER THE DATA YOU WANT TO INPUT:- ");
				int value = sc.nextInt();
				System.out.println("ENTER THE POSITION ");
				int pos = sc.nextInt();
				linklist.insertpos(pos, value);
				break;
			case 3:
				int n1 = linklist.delete();
				System.out.println(n1 + "is deleted from the linked list");
				break;
			case 4:
				System.out.println("Enter the position of the node you want to delete");
				int u = sc.nextInt();
				linklist.deletepos(u);
				break;
			case 5:
				int mid = linklist.getMiddleNode();
				System.out.println(mid + " is the value of the middle node ");
				break;
			case 6:
				System.out.println("Sorted list is: ");
				linklist.sortList();
				break;
			case 7:
				System.out.println(" The reversed linked list is ");
				linklist.reverse();
				break;
			case 8:
				int t = linklist.length();
				System.out.println("The length of the linked list is---->" + t);
				break;
			case 9:
				int start,end;
				System.out.println("Enter iteration number");
				start=sc.nextInt();
				end=sc.nextInt();
				linklist.Iterate(start,end);
				break;
			case 10:
				linklist.display();
				break;
			default:
				System.out.println("Error");

			}
			System.out.println("Do you want to do any more operation in the Linked list : yes/no");
			h = sc.next();
		}while(h.equals("yes"));
		sc.close();

	}

}

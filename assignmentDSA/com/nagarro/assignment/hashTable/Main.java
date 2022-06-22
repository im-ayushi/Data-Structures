package com.nagarro.assignment.hashTable;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter capacity of hash table");
		int capacity = sc.nextInt();
		HashTable hashtable = new HashTable(capacity);

		System.out.println("Select the operation you want to perform in hash table");
		System.out.println("1-Insert");
		System.out.println("2-Delete");
		System.out.println("3-Contains");
		System.out.println("4-Get Value by key");
		System.out.println("5-Size");
		System.out.println("6-Iterator");
		System.out.println("7-Traverse/print");
		String h = "no";

		do {
			System.out.println("Enter Your Choice:");
			int m = sc.nextInt();
			switch (m) {
			case 1:
				System.out.println("ENTER THE KEY:");
				int key = sc.nextInt();
				System.out.println("ENTER THE VALUE:");
				int value = sc.nextInt();
				hashtable.insert(key, value);
				break;
			case 2:
				System.out.println("ENTER THE KEY YOU WANT TO DELETE:");
				int key1 = sc.nextInt();
				hashtable.delete(key1);
				break;
			case 3:
				System.out.println("ENTER THE KEY:");
				int key2 = sc.nextInt();
				System.out.println("ENTER THE VALUE:");
				int value2 = sc.nextInt();
				boolean b=hashtable.contains(key2,value2);
				if (b == true)
					System.out.println(value2 + " is present in the hash table at key: "+key2);
				else
					System.out.println(value2 + " is not present in the hash table");
				break;
			case 4:
				System.out.println("Enter key");
				int key3 = sc.nextInt();
				int k= hashtable.getValueByKey(key3);
				if(k!=0)
					System.out.println(key3 + " is present in the hash table");
				else
					System.out.println(key3 + " is not present in the hash table");
				break;
			case 5:
				int mx = hashtable.getSize();
				System.out.println("Size of hash table is: " + mx);
				break;
			case 6:
				hashtable.getIterator();
				break;
			case 7:
				hashtable.display();
				break;
			default:
				System.out.println("Error");

			}
			System.out.println("Do you want to do any more operation in the Hash Table : yes/no");
			h = sc.next();
		} while (h.equals("yes"));
		sc.close();

	}
}
package com.nagarro.assignment.priorityQueue;



public class priorityQueue {
	Node head;

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void enqueue(priorityQueue pqueue, int data) {
		Node newnode = new Node(data);
		if (pqueue.head == null || data <= pqueue.head.data) {
			newnode.next = head;
			pqueue.head = newnode;
		} else {
			Node current = pqueue.head;
			while (current.next != null && current.next.data < data) {
				current = current.next;
			}
			newnode.next = current.next;
			current.next = newnode;
		}
	}
	
	public int dequeue(priorityQueue pqueue) {
		if(pqueue.head==null) {
			System.out.println(CommonConstants.emptyMsg);
			return -1;
		}
		int data=pqueue.head.data;
		pqueue.head=pqueue.head.next;
		return data;
	}
	
	public int peek(priorityQueue pqueue) {
		if(pqueue.head==null) {
			System.out.println(CommonConstants.emptyMsg);
			return -1;
		}
		int data=pqueue.head.data;
		return data;
	}
	
	public boolean contains(priorityQueue pqueue,int key) {
		Node current=pqueue.head;
		while(current!=null) {
			if(current.data==key)
				return true;
			current=current.next;
		}
		return false;
	}
	public int size(priorityQueue pqueue) {
		Node current=pqueue.head;
		int count=1;
		while(current.next!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	public void reverse(priorityQueue pqueue) {
		if (head == null) {
			System.out.println(head.data);
		}

		Node current = head;
		Node previous = null;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		Node current2 = previous;
		System.out.println("reversed linked list\n");
		while (current2 != null) {
			System.out.print(current2.data + " --> ");
			current2 = current2.next;
		}
	}
	public void center(priorityQueue pqueue) {
		if (pqueue.head == null) {
			System.out.println(CommonConstants.emptyMsg);
		}
		Node slowPtr = pqueue.head;
		Node fastPtr = pqueue.head;

		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		System.out.println("Center element: "+ slowPtr.data);
	}
	
	public void iterate(priorityQueue pqueue, int start, int end) {
		Node temp = head;
		int count = 1;
		System.out.println("Iterating from " + start + " to " + end + " Positions");
		while (temp != null && count < end) {
			temp = temp.next;
			count++;
			if (count >= start && count <= end) {
				System.out.println(temp.data);
			}
		}
	}
	public void print(priorityQueue pqueue) {
		Node current=pqueue.head;
		if(current==null) {
			System.out.println(CommonConstants.emptyMsg);
			return;
		}
		System.out.println("Priority Queue:");
		while(current!=null) {
			System.out.println(current.data+" ");
			current=current.next;
		}
		System.out.println(" ");
	}
}

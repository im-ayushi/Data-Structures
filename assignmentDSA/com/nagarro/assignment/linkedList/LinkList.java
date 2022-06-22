package com.nagarro.assignment.linkedList;

public class LinkList {
	Node head = null;
	int i = 0;

	public void insert(int data) {
		Node insertedNode = new Node(data);
		if (head == null) {
			head = insertedNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = insertedNode;
		}
	}

	public void insertpos(int position, int value) {
		Node Node = new Node(value);

		if (position == 1) {
			Node.next = head;
			head = Node;
		} else {
			Node previous = head;
			int count = 1; // position - 1

			while (count < position - 1) {
				previous = previous.next;
				count++;
			}

			Node current = previous.next;
			previous.next = Node;
			Node.next = current;
		}

	}

	public int delete() {
		Node temp = head;
		int curr = 0;
		if (head == null) {
			System.out.println(CommonConstants.emptyMsg);
		} else if (temp.next == null) {
			head = null;
		} else {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			curr = temp.next.data;
			temp.next = null;
		}

		return curr;
	}

	public void deletepos(int position) {
		// position is valid and starting from 1
		// 3 -> 4 -> 7 -> 8 -> 9 -> null
		Node temp = head;
		if (head == null) {
			System.out.println(CommonConstants.emptyMsg);
		} else {
			Node prev = null;
			int count = 1;
			while (temp.next != null && count < position) {
				prev = temp;
				temp = temp.next;
				count++;
			}
			if (temp.next != null) {
				prev.next = temp.next;
			} else {
				System.out.println(temp.data);
				prev.next = null;

			}
		}
	}

	public int getMiddleNode() {
		if (head == null) {
			return 0;
		}
		Node slowPtr = head;
		Node fastPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr.data;
	}

	public void sortList() {
		Node current = head, index = null;
		int temp;

		if (head == null) {
			return;
		} else {
			while (current != null) {

				index = current.next;

				while (index != null) {
					// If current Node's data is greater
					// than index's Node data, swap the data
					// between them
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}

					index = index.next;
				}
				current = current.next;
			}
		}
		Node current1 = head;

		if (head == null) {
			System.out.println(CommonConstants.emptyMsg);
			return;
		}
		while (current1 != null) {
			// Prints each Node by incrementing pointer
			System.out.print(current1.data + " ");
			current1 = current1.next;
		}

		System.out.println();
	}

	public void reverse() {
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
		// System.out.print("null");
	}

	public int length() {
		if (head == null) {
			return 0;
		}
		int count = 0;
		Node current3 = head;
		while (current3 != null) {
			count++;
			current3 = current3.next;
		}
		return count;
	}

	public void Iterate(int start, int end) {
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

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("\n");
	}

}

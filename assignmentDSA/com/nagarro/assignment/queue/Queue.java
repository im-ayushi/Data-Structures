package com.nagarro.assignment.queue;

public class Queue {
	int size;
	int front, rear;
	int a[];

	public Queue(int size) {
		front = -1;
		rear = -1;
		this.size = size;
		a = new int[size];
	}

	public boolean isFull(Queue queue) {
		return rear == size - 1;
	}

	public boolean isEmpty(Queue queue) {
		return front == -1;
	}

	public void enqueue(Queue queue, int value) {
		if (isFull(queue)) {
			System.out.println(CommonConstants.fullMsg);
			return;
		} else {
			if (front == -1 && rear == -1)
				front = 0;
			a[++rear] = value;
		}
	}

	public int dequeue(Queue queue) {
		if (isEmpty(queue)) {
			System.out.println(CommonConstants.emptyMsg);
			return -1;
		}
		int value = a[front];
		if (front == rear) {
			front = -1;
			rear = -1;
		} else {
			front++;
		}
		return value;
	}

	public int peek(Queue queue) {
		if (isEmpty(queue)) {
			System.out.println(CommonConstants.emptyMsg);
			return -1;
		}
		int value = a[front];
		return value;
	}

	public boolean contains(Queue queue, int key) {
		if (isEmpty(queue))
			return false;
		for (int i = front; i <= rear; i++) {
			if (a[i] == key)
				return true;
		}
		return false;
	}

	public int size(Queue queue) {
		if (isEmpty(queue))
			return 0;
		return rear - front + 1;
	}

	public void middle(Queue queue) {
		if (((rear - front) + 1) % 2 != 0)
			System.out.println("The centre element is " + a[((rear - front) / 2) + 1]);
		else
			System.out.println(
					"The centre element is: " + a[((rear - front)) / 2 + 1] + " and " + a[((rear - front)) / 2 + 2]);
	}

	public void sort(Queue queue) {
		// int n = queue.a.length;
		for (int i = front; i < rear + 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j <= rear; j++)
				if (a[j] < a[min_idx])
					min_idx = j;
			int temp = a[min_idx];
			a[min_idx] = a[i];
			a[i] = temp;
		}
		System.out.println("Sorted Queue:");
		for (int i = front; i < rear + 1; i++) {
			System.out.print(a[i] + "-->");
		}
		System.out.println();

	}

	public void reverse(Queue queue) {
		int left = front;
		int right = rear;
		while (left < right) {
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
		System.out.println("Reversed Queue:");
		for (int i = front; i < rear + 1; i++) {
			System.out.print(a[i] + "-->");
		}
		System.out.println();
	}

	public void Iterate(int first, int last) {
		if ((first < front && last < front) || (first > rear && last > rear)) {
			System.out.println("Value of range entered is wrong!");

		} else if (last >= front && last <= rear && first <= rear) {
			System.out.println("Iteraring from " + first + " and " + last);
			if (first < front) {
				first = front;
			}

			for (int counter = first; counter <= last; counter++) {
				System.out.println(a[counter] + "\t");
			}

		} else {
			System.out.println("Value of range entered is wrong!");
		}
	}

	public void print(Queue queue) {
		if (isEmpty(queue)) {
			System.out.println(CommonConstants.emptyMsg);
			return;
		} else {
			System.out.println("Values in queue are:");
			for (int i = front; i <= rear; i++) {
				System.out.println(a[i] + " ");
			}
			System.out.println();

		}
	}

}

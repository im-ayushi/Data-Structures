package com.nagarro.assignment.stack;

public class Stack {
	int size;
	int top;
	int a[];

	public Stack(int size) {
		top = -1;
		this.size = size;
		a = new int[size];
	}

	public boolean isFull(Stack st) {
		return top == size - 1;
	}

	public boolean isEmpty(Stack st) {
		return top == -1;
	}

	public void push(Stack st, int data) {
		if (isFull(st)) {
			System.out.println(CommonConstants.fullMsg);
			return;
		} else {
			a[++top] = data;
		}
	}

	public int pop(Stack st) {
		if (isEmpty(st)) {
			System.out.println(CommonConstants.emptyMsg);
			return -1;
		}
		int data = a[top--];
		return data;
	}

	public int peek(Stack st) {
		if (isFull(st)) {
			System.out.println(CommonConstants.emptyMsg);
			return -1;
		}
		int data = a[top];
		return data;
	}

	public boolean contains(Stack st,int key) {
		int x = top;
		while (x >= 0) {
			if (a[x--] == key)
				return true;
		}
		return false;
	}

	public int size(Stack st) {
		return top++;
	}

	public int middle(Stack st) {
		int length = top + 1;
		int value = st.a[length / 2];
		return value;
	}

	public void sort(Stack st) {
		int n = st.a.length;
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (a[j] < a[min_idx])
					min_idx = j;
			int temp = a[min_idx];
			a[min_idx] = a[i];
			a[i] = temp;
		}
		System.out.println("Sorted Stack");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + "-->");
		}
	}

	public void reverse(Stack st) {
		int n = top + 1;
		for (int i = 0; i < n / 2; i++) {
			int temp = a[i];
			a[i] = a[n + 1 - i];
			a[n + 1 - i] = temp;
		}
		System.out.println("Reversed Stack");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + "-->");
		}
	}

	public void Iterate(int first, int last)
    {
        if(top==-1)
        {
            System.out.println(CommonConstants.emptyMsg);
        }
        System.out.println("Iteraring from"+first+" to "+last);
        for (int counter = first; counter >= last; counter--)
        {
            System.out.println(a[counter] + "\t");
        }
    }
	public void print(Stack st) {
		if (isEmpty(st)) {
			System.out.println(CommonConstants.emptyMsg);
			return;
		} else {
			System.out.println("Values in stack are:");
			for (int i = top; i >= 0; i--) {
				System.out.println(a[i] + " ");
			}
			System.out.println();

		}
	}

}

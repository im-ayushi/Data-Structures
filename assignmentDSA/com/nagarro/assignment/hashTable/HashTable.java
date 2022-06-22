package com.nagarro.assignment.hashTable;

public class HashTable {
	public HashNode[] hashTableData;
	public int capacity, size;

	public HashTable(int capacity) {
		this.capacity = capacity;

		hashTableData = new HashNode[capacity];

		for (int i = 0; i < hashTableData.length; i++) {
			hashTableData[i] = null;
		}
		size = 0;
	}

	public void insert(int key, int value) {
		if (key != 0) {
			size++;
			int index = key;
			int hash = hashThis(index);

			while (hashTableData[hash] != null && hashTableData[hash].key != key) {
				hash = (hash + 1) % capacity;
			}

			hashTableData[hash] = new HashNode(key, value);
		}

		System.out.println("Value along with key inserted successfully!");
	}

	private int hashThis(Integer index) {
		return index.hashCode() % capacity;
	}

	public void delete(int key) {
		Integer index = key;
		int hash = hashThis(index);

		HashNode head = hashTableData[hash];

		while (head != null) {
			if (head.key == key) {
				size--;
				this.hashTableData[hash] = null;
			}
			head = head.next;
		}
		System.out.println("Removed Successfully!");
	}

	
	public boolean contains(int key, int value) {
		boolean result = false;

		for (HashNode node : hashTableData) {
			if (node != null) {
				int nodeValue = node.getValue();
				int nodeKey = node.getKey();

				if (nodeValue == value && nodeKey == key) {
					result = true;

				}
			}
		}
		return result;
	}

	public int getValueByKey(int key) {
		Integer index = key;
		int hash = hashThis(index);

		HashNode node = hashTableData[hash];
		if (node != null) {
			return node.getValue();
		}
		return 0;
	}

	public int getSize() {
		return this.size;
	}
	
	public table_iterator getIterator() {
		return new table_iterator(this);
	}

	public void display() {
		String st = "";
		for (int i = 0; i < this.capacity; i++) {
			if (hashTableData[i] != null) {
				st += hashTableData[i].toString();
			}
		}
		System.out.println("Elements in hash table along with their key values are:" + st);
	}

}

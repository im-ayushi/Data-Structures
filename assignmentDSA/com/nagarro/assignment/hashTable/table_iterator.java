package com.nagarro.assignment.hashTable;

import java.util.*;

public class table_iterator implements Iterator<HashNode>{
	
	HashNode[] array;
	int currentSize;
	int currentIndex;
	
	public table_iterator(HashTable table) {
		System.out.println("Iterator implemented");
		currentSize=table.size;
		array=table.hashTableData.clone();
		currentIndex=1;
	}
	
	@Override
	public boolean hasNext() {
		return currentIndex<currentSize && array[currentIndex]!=null;
	}
	
	@Override
	public HashNode next() {
		HashNode node=array[currentIndex];
		currentIndex++;
		return node;
	}
}

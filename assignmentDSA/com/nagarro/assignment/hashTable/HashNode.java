package com.nagarro.assignment.hashTable;

public class HashNode {
	int key,value;
	HashNode next;
	
	public HashNode(int key,int value) {
		this.key=key;
		this.value=value;
		this.next=null;
	}
	
	public int getKey() {
		return this.key;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setKey(int key) {
		this.key=key;
	}
	
	public void setValue(int value) {
		this.value=value;
	}
	
	public HashNode getNext() {
		return next;
	}
	
	public void setNext(HashNode next) {
		this.next=next;
	}
	
	public String toString() {
		String s="(";
		s+= this.getKey() +","+this.getValue()+")";
		return s;
	}
}

package com.capg.datastructures_hashmap;

public class MyLinkedList<K> {
	INode<K> head;
	INode<K> tail;
	
	public MyLinkedList() {
		this.head = null;
	}
	
	public INode<K> getHead(){
		return head;
	}
	
	public void setHead(INode<K> head) {
		this.head = head;
	}
	
	public INode<K> getTail(){
		return tail;
	}
	
	public void setTail(INode<K> tail) {
		this.tail = tail; 
	}
	
	public INode<K> searchNode(K key) {
		INode<K> tempNode = head;
		while (tempNode != null && tempNode.getNext() != key) {
			if(tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public void append(INode<K> myNode) {
		if(head == null) {
			head = myNode;
		}
		if(tail == null) {
			tail = myNode;
		}
		else {
			tail.setNext(myNode);
			tail = myNode;
		}
	}
	
	public String toString() {
		return "My Linked list node{ " + head + "}";
	}
}
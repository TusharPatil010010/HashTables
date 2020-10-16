package com.capg.datastructures_hashmap;

public class MyHashMap<K, V> {
	MyLinkedList<K> myLinkedList;

	public MyHashMap() {
		myLinkedList = new MyLinkedList<>();
	}

	/**
	 * Returns a value for a key
	 * 
	 * @param key
	 * @return
	 */
	public V get(K key) {
		@SuppressWarnings("unchecked")
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.searchNode(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	/**
	 * Adds a key value pair to the list
	 * 
	 * @param key
	 * @param value
	 */
	public void add(K key, V value) {
		@SuppressWarnings("unchecked")
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.searchNode(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			this.myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	public String toString() {
		return "MyHashMapNodes{ " + myLinkedList + "}";
	}
}

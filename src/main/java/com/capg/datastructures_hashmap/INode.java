package com.capg.datastructures_hashmap;

public interface INode<k> {
	
	public k getKey();

	public void setKey(k key);

	public INode<k> getNext();

	public void setNext(INode<k> next);

}

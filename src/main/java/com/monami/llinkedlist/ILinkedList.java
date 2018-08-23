package com.monami.llinkedlist;

public interface ILinkedList {
	public boolean isEmpty();
	public int getSize();
	public void insertStart(int value);
	public void insertEnd(int value);
	public void insertPos(int value,int pos);
	public void deletePos(int pos);
	public void display();
	

}

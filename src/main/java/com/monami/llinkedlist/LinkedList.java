package com.monami.llinkedlist;


public class LinkedList implements ILinkedList {
	protected Model start;
	protected Model end;
	public int size;

	public LinkedList() {
		start = null;
		end = null;
		size = 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return start == null;
	}

	public int getSize() {
		return size;
		// TODO Auto-generated method stub

	}

	public void insertStart(int value) {
		// TODO Auto-generated method stub
		Model ntpr = new Model(value, null);
		size++;
		if (start == null) {
			start = ntpr;
			end = start;
		} else {
			ntpr.setLink(start);
			start = ntpr;
		}

	}

	public void insertEnd(int value) {
		// TODO Auto-generated method stub
		Model ntpr = new Model();
		size++;
		if (start == null) {
			start = ntpr;
			end = start;
		} else {
			end.setLink(ntpr);
			end = ntpr;
		}

	}

	public void insertPos(int value, int pos) {
		// TODO Auto-generated method stub
		Model ntpr = new Model(value, null);
		Model ptr = start;
		pos = pos - 1;
		for (int j = 1; j <= size; j++)

		{
			if (j == pos) {
				Model tmp = ptr.getLink();
				ptr.setLink(ntpr);
				ntpr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}

		size++;
	}

	public void deletePos(int pos) {
		// TODO Auto-generated method stub
		if (pos == 1) {
			start = start.getLink();
			size--;
			return;
		}
		if (pos == size) {
			Model s = start;
			Model t = start;
			while (s != end) {
				t = s;
				s = s.getLink();
			}
			end = t;
			end.setLink(null);
			size--;
			return;
		}
		Model ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size - 1; i++) {
			if (i == pos) {
				Model tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size--;
	}

	public void display() {

		// TODO Auto-generated method stub
		System.out.print("\nSingly Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (start.getLink() == null) {
			System.out.println(start.getData());
			return;
		}
		Model ptr = start;
		System.out.print(start.getData() + "->");
		ptr = start.getLink();
		while (ptr.getLink() != null) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData() + "\n");
	}

}

package com.monami.llinkedlist;

public class Model {
	protected int data;
	protected Model link;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	public Model()
	{
		data=0;
		link=null;
	}
	public Model(int d,Model n)
	{
		data=d;
		link=n;
	}
	public void setLink(Model n)
	{
		link=n;
	}
	public Model getLink()
	{
		return link;
		
	}

}

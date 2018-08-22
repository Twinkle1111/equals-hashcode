package com.monami.exam.equals_hashcode;

public class EqualsDemo {
	private String idNo;
	public EqualsDemo(String idNo) {
		// TODO Auto-generated constructor stub
		this.idNo=idNo;
	}
	public static void main(String[] args)
	{

	EqualsDemo dd = new EqualsDemo("123");
	EqualsDemo dd1 = new EqualsDemo("123");
	System.out.println(dd.hashCode());
	System.out.println(dd1.hashCode());
	System.out.println(dd.equals(dd1));//false
	System.out.println(dd==dd1);//false

}

}

package com.monami.exam.equals_hashcode;

public class WrapperClass {
	public static void main(String[] args) {
	Integer in=new Integer(120);
	Integer in1=new Integer(120);
	System.out.println(in.hashCode());
	System.out.println(in1.hashCode());
	System.out.println(in.equals(in1));
	System.out.println(in==in1);
	Integer inn=245;
	Integer inn1=245;
	System.out.println(inn.hashCode());
	System.out.println(inn1.hashCode());
	System.out.println(inn.equals(inn1));
	System.out.println(inn==inn1);
	Integer inn2=new Integer(123);
	Integer inn3=123;
	System.out.println(inn2.hashCode());
	System.out.println(inn3.hashCode());
	System.out.println(inn2.equals(inn3));
	System.out.println(inn2==inn3);
	}

}

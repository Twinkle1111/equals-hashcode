package com.monami.exam.equals_hashcode;

public class StringConstantPoolExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("123");//Both str and str2 refer to the same object 
		String str2=new String("123");
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str.equals(str2));//equals method will check the contains so it will return true
		System.out.println(str==str2);//this equal operator will refer to the object .Here it will refer to the different object so it will return true
		String st="120";
		String st1="120";
		System.out.println(st.equals(st1));//It will return true as contains same
		System.out.println(st==st1);//It will return true as referred to the same Object
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
		String str3=new String("107");
		String str4="107";
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str3.equals(str4));//true
		System.out.println(str3==str4);//false as refer to different object

	}

}

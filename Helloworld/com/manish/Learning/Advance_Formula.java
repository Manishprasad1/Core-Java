package com.manish.Learning;

public class Advance_Formula {

	//declare fields
	int a,b,c;
	
	public Advance_Formula() {
		// TODO Auto-generated constructor stub
		a=0;
		b=0;
		c=0;
	}
		
	
	public int add(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Calling super class method");
		System.out.println(a+b);
		return a+b;
	}
	
	
}

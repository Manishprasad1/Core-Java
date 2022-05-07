package com.manish.Learning;

public class Formula extends Advance_Formula{
	
	/*
	 * Purpose to declare all method used in calculator
	 * 
	 */
	
	//declare private variables
	private static int main_menu=0;
	private static int sub_menu=0;
	
	private int a,b,c;
	public Formula() {
		// TODO Auto-generated constructor stub
		super();
		a=0;
		b=0;
		c=0;
	}
	
	
	
	//call super class as well as current class method with same names
	public int add(int a, int b) {
		//calling super class method
		super.add(10, 15);
		System.out.println("child class calling super method");
		return c=a+b;
	}
	
	//multiply
	public int mul(int a, int b) {
		return c=a*b;
	}
	
	//divide
	
	public float divide(int a, int b) {
		return c=a/b;
	}

	
	
	/// getter & setter methods
	/**
	 * @return the a
	 */
	protected int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	protected void setA(int a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	protected int getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	protected void setB(int b) {
		this.b = b;
	}

	/**
	 * @return the c
	 */
	protected int getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	protected void setC(int c) {
		this.c = c;
	}

	
	
	
	
	
	

}

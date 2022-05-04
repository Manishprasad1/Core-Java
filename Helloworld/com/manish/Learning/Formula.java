package com.manish.Learning;

public class Formula {
	
	/*
	 * Purpose to declare all method used in calculator
	 * 
	 */
	
	//declare private variables
	private int a,b,c;
	public Formula() {
		// TODO Auto-generated constructor stub
		a=0;
		b=0;
		c=0;
	}
	
	//add 
	public int add(int a, int b) {
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

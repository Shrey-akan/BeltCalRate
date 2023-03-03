package com.beltrate;
//factory design pattern
public abstract class Belt {
	protected double rate;
	abstract void getrate();
	
	public void calAmount(int size , int qnty) {
		System.out.println(rate*size*qnty+" Rs ");
	}
}

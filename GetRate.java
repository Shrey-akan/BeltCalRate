package com.beltrate;

public class GetRate {
	public Belt getPlan(String Section) {
		if(Section == null) {
			return null;
		}
		if(Section.equalsIgnoreCase("A")) {
			return new A();
		}
		else {
			if(Section.equalsIgnoreCase("B")) {
				return new B();
			}
			else {
				return new C();
			}
		}
	}
	
}

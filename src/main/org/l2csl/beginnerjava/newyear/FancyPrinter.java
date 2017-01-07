package org.l2csl.beginnerjava.newyear;

public class FancyPrinter {
	String[] stringArr;

	public FancyPrinter(String str) {
		super();
		this.stringArr = str.split(" ");
	}
	
	public void print() {
		for(String i : stringArr){
			
			System.out.println(i);
		}
	}
	
	
}

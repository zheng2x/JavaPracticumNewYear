package org.l2csl.beginnerjava.newyear;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int sum;
		sum = add(3, 5);
		
		
		explode("Boom!");
		
		
		FancyPrinter fp = new FancyPrinter("I can code");
		fp.print();
		
		
		ClassyPrinter cp = new ClassyPrinter("I'm a pro");
		cp.print();
		
		cp.print2(true);
	}
	
	public static int add(int first, int second) {
		
		int sum = first + second;
		return sum;
	}
	
	public static void explode (String param) {
		for(int i=0; i<param.length(); i++) {
			System.out.println(param.charAt(i));
		}
	}
	
}

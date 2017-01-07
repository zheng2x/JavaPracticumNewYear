package org.l2csl.beginnerjava.newyear;

public class ClassyPrinter extends FancyPrinter {

	public ClassyPrinter(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void print() {
		for(int i=stringArr.length-1; i>=0; i--) {
			System.out.println(stringArr[i]);
		}
	}
	
	public void print2 (Boolean b) {
		if(b) {
			super.print();
		}else{
			this.print();
		}
	}
	
}

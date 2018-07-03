package org.java8;

class A {
	public void one() {
		System.out.println("one");
	}
}

public class Lambda extends A{
	public void one() {
		super.one();
		System.out.println("two");
	}

	public static void main(String[] args) {
		//Str strings =s -> s+"10";
        //System.out.println(strings.perform("20"));
		
		A one=new Lambda();
		one.one();
	
	}
	
	
	interface Str{
		String perform(String s);
	}
}

	


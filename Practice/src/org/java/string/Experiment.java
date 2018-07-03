package org.java.string;

class A{
	void show1() {
		System.out.println();
	}
}
class B extends A{
	void show() {
		System.out.println("2");
	}
}
public class Experiment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new B();
		a.show1();

	}

}

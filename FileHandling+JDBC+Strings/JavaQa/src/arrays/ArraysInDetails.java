package arrays;

import java.util.Arrays;


class A{
	public void add() {
		System.out.println("A");
	}
}

class B extends A{
	@Override
	public void add() {
		System.out.println("B");

	}
}

class C extends B{

	public void add() {
		System.out.println("C");

	}
}
public class ArraysInDetails {
	public static void main(String[] args) {
		A a = new C();
		a.add();
	}
}

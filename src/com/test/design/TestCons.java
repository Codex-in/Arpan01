package com.test.design;

class Testcona
{
	public Testcona() {
		System.out.println("Hi from constructor Body");
	}
	public Testcona(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
	}
}

public class TestCons {
	public static void main(String[] args) {
		new Testcona(12,13);
	}

}

package com.raji;

public class Test {
	int[] m1() {
		System.out.println("m1 method");
		int[] a = { 1, 2, 3, 4 };
		return a;
	}

	void m2(double[] d) {
		System.out.println("m2 method");
		for (double dd : d) {
			System.out.println(dd);
		}
	}

	public static void main(String[] args) {
		Test test = new Test();
		int[] n = test.m1();
		for (int i : n) {
			System.out.println(i);
		}
		double[] d = { 2.3, 3.3, 4.4, 5.5 };
		test.m2(d);
	}
}

package com.demo.staticblock;

import java.util.Random;

public class StaticBlockDemo {
	public static int a[] = new int[10];

	static {
		System.out.println("Static Block Demo successfully running......");
		Random rnd = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextInt();
		}
	}

	public void listValues() {
		System.out.println("The elements of the array are ----");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}
}
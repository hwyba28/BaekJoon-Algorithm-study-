package com.hw.basic34;

import java.util.Scanner;

public class Q1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		int a;
		int b;
		int count = 0;
		do {
			a = m/10;
			b = m%10;
			String str = Integer.toString(b) + Integer.toString((a+b)%10);
			//String.valueOf -> toString
			m = Integer.parseInt(str);
			count++;
		} while (m != n);
		System.out.print(count);
	}
}

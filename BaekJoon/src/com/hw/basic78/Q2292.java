package com.hw.basic78;

import java.util.Scanner;

public class Q2292 {
	public static void main(String[] args) {
		//1(1) 2~7(6) 8~19(12) 20~37(18)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if (n == 1) {
			System.out.print(1);
		} else {
			int i = 1;
			int num = 1;
			while (num < n) {
				num += (6*i);
				i++;
			}
			System.out.print(i);
		}
	}
}

package com.hw.basic56;

import java.util.Scanner;

public class Q1065 {
	//an = a1 + (n-1)d
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 100) {
			System.out.print(n);
			sc.close();
			return ;
		}
		//n < 1000 理쒕� 3�옄由�
		int count = 99;
		for (int i = 100; i <= n; i++) {
			if ((i/10%10 - i%10) == (i/100 - i/10%10)) {
				count++;
			}
		}
		System.out.print(count);
		sc.close();
	}
}

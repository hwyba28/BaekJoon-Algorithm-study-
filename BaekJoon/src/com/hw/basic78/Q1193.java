package com.hw.basic78;

import java.util.Scanner;

public class Q1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while (n != 0) {
			n = sc.nextInt();
			//1/1 .. 1/2 2/1 .. 1/3 2/2 3/1 .. 
			int i = 1;
			int num = 0;
			while (num < n) {
				num += i;
				i++;
			}
			i--;
			num = num-i;
			if (i%2 != 0) {//역행
				System.out.print((i+1-n+num)+"/"+(n-num));
			} else {//선행
				System.out.print((n-num)+"/"+(i+1-n+num));
			}
			System.out.println();
		}
		sc.close();
	}
}

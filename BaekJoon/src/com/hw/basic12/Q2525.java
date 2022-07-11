package com.hw.basic12;

import java.util.Scanner;

public class Q2525 {
	public static void main(String[] args) {
		//초반 조건 return
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		sc.close();
		int result = h*60 + m + t;
		while (result >= 24*60)
			result = result - 24*60;
		if (result == 0) {
			System.out.println("0 0");
			return;
		}
		//디지털 시계이므로 24: 00 대신 0:0 며칠 걸린 경우도 생각
		System.out.println(result/60 + " " + result%60);
	}
}

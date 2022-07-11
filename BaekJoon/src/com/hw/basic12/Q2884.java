package com.hw.basic12;

import java.util.Scanner;

public class Q2884 {
	public static void main(String[] args) {
		//분으로 바꾸기 10 10
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		//610 - 45 = 565
		int hm = h*60 + m - 45;
		if (hm < 0)
			hm = hm + 24*60;
		System.out.print(hm/60 + " " + hm%60);
	}
}

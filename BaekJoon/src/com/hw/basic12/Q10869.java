package com.hw.basic12;

import java.util.Scanner;
/*
 * 
 * A+B, A-B, A*B, A/B(¸ò), A%B(³ª¸ÓÁö)
 *///(1 ¡Â A, B ¡Â 10,000)
public class Q10869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		//nextInt
		sc.close();
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		if (a < 1 || b > 10000)
			return;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}

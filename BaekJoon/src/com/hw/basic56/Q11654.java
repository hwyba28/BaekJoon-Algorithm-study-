package com.hw.basic56;

import java.util.Scanner;

public class Q11654 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		System.out.print((int)b.charAt(0)); // parseInt는 강제변환이 아니므로, 다 처리됨
		sc.close();
	}
}

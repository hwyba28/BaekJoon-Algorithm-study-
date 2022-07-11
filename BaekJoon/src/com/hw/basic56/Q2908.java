package com.hw.basic56;

import java.util.Scanner;

public class Q2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int a[] = new int[3];
		//int b[] = new int[3];
		
		String a = "";
		String b = "";
		
		
		String as = sc.next();
		String bs = sc.next();
		//또는 세자리수 아스키 코드 비교도 가능
		for(int i=0;i<3;i++) {
			a += as.charAt(2-i);
			b += bs.charAt(2-i);
		}
		if (Integer.parseInt(a) > Integer.parseInt(b))
			System.out.println(a);
		else
			System.out.println(b);
	}
}


/*
 * 		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int ra = 0 ,rb = 0;
		int i = 1; //324
		//itoa
		int n = 100;
		while (i <= 3) { // i = 0,1,2
			ra += a%10*n;
			rb += b%10*n;
			n = n/10;
			a = a/10;
			b = b/10;
			i++;
		}
		if (ra > rb)
			System.out.print(ra);
		else
			System.out.print(rb);
 */
 
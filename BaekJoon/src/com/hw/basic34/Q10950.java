package com.hw.basic34;

import java.util.Scanner;

public class Q10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int tc = t;
		int[] arr = new int[t];
		int a;
		int b;
		
		while(t > 0) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[tc-t] = a+b;
			t--;
		}
		for (int i =0;i<tc;i++)
			System.out.println(arr[i]);
	}
}

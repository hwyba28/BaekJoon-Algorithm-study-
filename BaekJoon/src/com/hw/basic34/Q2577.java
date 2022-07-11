package com.hw.basic34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		ArrayList<Character> list = new ArrayList<>();
		
		//toString 이용-훨씬 간단
		//charAt
		int result = A*B*C;
		while (result > 0) {
			list.add((char)((result%10)+'0'));
			result = result/10;
		}
		
		int[] answer = new int[10];
		Arrays.fill(answer, 0);
		for (int i = 0; i<list.size(); i++) {
			for (int j=0; j<10; j++) {
				if ((int)(list.get(i) -'0') == j)
					answer[j] += 1;
			}
		}
		for (int i=0; i<10; i++)
			System.out.println(answer[i]);
	}
}

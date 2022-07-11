package com.hw.basic34;

import java.util.Scanner;

public class Q10871 {
	public static void main(String[] args) {
		//StringBuilder -> 한번에 출력 가능
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		int a = n;
		while (a > 0){
			arr[n-a] = sc.nextInt();
			a--;
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] < x)
				System.out.print(arr[i]+" ");
		}
	}
}

package com.hw.basic34;

import java.util.Scanner;

public class Q10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min;
		int max;
		
		int[] arr = new int[n];
		while (n > 0) {
			n--;
			arr[n] = sc.nextInt();
		}
		min = arr[0];
		max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
			if (max < arr[i])
				max = arr[i];
		}
		System.out.print(min+" "+max);
	}
}

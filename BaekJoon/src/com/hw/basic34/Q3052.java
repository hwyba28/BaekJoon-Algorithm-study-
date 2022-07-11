package com.hw.basic34;

import java.util.Arrays;
import java.util.Scanner;

public class Q3052 {
	//HashSet --> 중복없음
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int i = 0;
		while (i < 10) {
			arr[i] = sc.nextInt()%42;
			i++;
		}
		Arrays.sort(arr);
		int pivot = arr[0];
		int count = 1;
		i = 1;
		while (i < 10) {
			if (arr[i] != pivot)
			{//11223
				pivot = arr[i];
				count++;
			}
			i++;	
		}
		System.out.print(count);
		sc.close();
	}
}

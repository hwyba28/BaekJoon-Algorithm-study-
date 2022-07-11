package com.hw.basic34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class Q2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = -1;
		int j = 0;
		int[] arr = new int[9];
		while (i < 8) {
			i++;
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = arr[8];
		i = 7;
		while (i >= 0) {
			if (max < arr[i]) {
				max = arr[i];
				j = i;
 			}
			i--;
		}
		System.out.print(max+"\n"+(j+1));
	}
}

// Arrays.sort(arr); Arrays.binarySearch(arr, max)
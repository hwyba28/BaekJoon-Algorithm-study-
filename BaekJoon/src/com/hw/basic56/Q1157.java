package com.hw.basic56;
//65~90 / 97~122
import java.util.Arrays;
import java.util.Scanner;

public class Q1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] arr = new int[26];
		Arrays.fill(arr, 0);
		int i = 0;
		while (i<str.length()) {
			if ((int)str.charAt(i) > 90 )
				arr[(int)str.charAt(i)-97] += 1;
			else
				arr[(int)str.charAt(i)-65] += 1;
			i++;
		}
		i = 1;
		int max = arr[0];
		int mn = 0;
		boolean q = false;
		while (i < arr.length) {
			if (max < arr[i]) {
				max = arr[i];
				mn = i;
				q = false;
			} else if (max == arr[i])
				q = true;
			i++;
		}
		if (!q)
			System.out.print((char)(mn+65));
		else
			System.out.print("?");
		sc.close();
	}
}

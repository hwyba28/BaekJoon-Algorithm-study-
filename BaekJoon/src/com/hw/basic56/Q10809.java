package com.hw.basic56;

import java.util.Arrays;
import java.util.Scanner;
//�냼臾몄옄 26媛� �냼臾  몄옄 a = > �븘�뒪�궎 65(��臾몄옄)x -> 97
public class Q10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		int i = 0;
		while (i < str.length()) {
			if (arr[(int)str.charAt(i)-97] == -1)
				arr[(int)str.charAt(i)-97] = i;
			i++;
		}
		i = 0;
		while (i < arr.length) {
			System.out.print(arr[i]+" ");
			i++;
		}
		sc.close();
	}
}

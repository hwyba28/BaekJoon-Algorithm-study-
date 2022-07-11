package com.hw.basic56;

import java.util.Arrays;
//import java.util.HashMap;
import java.util.Scanner;

public class Q5622 {
	public static void main(String[] args) {
		//알파벳 대문자 개수 26
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String num = "";
		String[] arr = {"ABC","DEF","GHI","JKL","NMO","PQRS","TUV","WXYZ"};
		int i = 0;
		while (i < str.length()) {
			int j = 0;
			while(j < arr.length) {
				if(arr[j].contains(String.valueOf(str.charAt(i)))) {
					num += Integer.toString(j+2);
					break;
				}
				j++;
			}
			i++;
		}
		//System.out.print(num);
		i = 0;
		int sum = 0;
		while (i < num.length()) {
			sum += Character.getNumericValue(num.charAt(i))+1;
			i++;
		}
		System.out.print(sum);
		sc.close();
	}
}

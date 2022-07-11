package com.hw.basic56;

import java.util.Scanner;

public class Q2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};

		//int count = 0;
		int i = 0;
		
		while (i < arr.length) {
			if (str.contains(arr[i])) {//contains 둘다 문자열 가능
				str = str.replace(arr[i],"a"); // replace내용을 다시 저장해줘야함
			}
			i++;
		}
		//System.out.print(str);
		System.out.print(str.length());
		sc.close();
	}
}

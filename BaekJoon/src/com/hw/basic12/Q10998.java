package com.hw.basic12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10998 {
	public static void main(String[] args) throws IOException {
		int a,b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		a = Integer.parseInt(str.split(" ")[0]);
		b = Integer.parseInt(str.split(" ")[1]);
		System.out.print(a*b);
	}
}

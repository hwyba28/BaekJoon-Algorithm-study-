package com.hw.basic56;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Q11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 5
		String str = br.readLine(); // 12345
		//StringTokenizer st = new StringTokenizer(str,"");
		//stringTokenizer 는 구분자 없으면 안됨("")-안되므로, charAt이나 split 사용
		int sum = 0;
		int i = 0;
		while (i < n) {
			sum += Character.getNumericValue(str.charAt(i));
			i++;
		}
		System.out.print(sum);
		br.close();
	}
}

package com.hw.basic56;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q4673 {
	static int initNum (int n) {
		int sum = n;
		while (n > 0) {
			sum += n%10;
			n = n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int i = 1;
		int n = 10000;
		boolean[] arr = new boolean[10001];
		//Arrays.fill(arr, false);//boolean 초기값 false
		while (i <= n) {
			int num = initNum(i);
			if (num <= n)
				arr[num] = true;
			i++;
		}
		i = 1;
		while (i <= n) {
			if (!arr[i])
				bw.write(i+"\n");
			i++;
		}
		bw.flush();	
		bw.close();
	}

	
}

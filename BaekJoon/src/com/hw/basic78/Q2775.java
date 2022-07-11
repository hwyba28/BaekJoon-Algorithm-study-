package com.hw.basic78;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.IOException;
//고정값 문제는 입력과 별개로 미리 계산해놓고 시작하는게 메모리 덜 낭비

public class Q2775 {
	public static void main(String[] args) throws IOException {
		//3-1 3-5 3-15 3-35 3-70 ... 4 10 20 35
		//2-1 2-4 2-10 2-20 2-35 ... 3 6 10 15
		//1-1 1-3 1-6 1-10 1-15 ... 2 3 4 5
		
		//01 02 03 04 05 ... 
		
		int[][] arr = new int[15][14];//0~14층/1~14호			
		for (int i=0; i<14; i++) {
			arr[0][i] = i+1;
			arr[i+1][0] = 1;
		}
		
		for(int i=1; i<15; i++) {
			for(int j=1; j<14; j++) {
				int k = 0;
				while(k <= j) {
					arr[i][j] += arr[i-1][k];
					k++;
				}
			}
		}
		
	
//		for(int i=0; i<15; i++) {
//			for(int j=0; j<14; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		sc.nextLine();
		while (t > 0) {
			int k = Integer.parseInt(sc.nextLine()); //k층
			int n = Integer.parseInt(sc.nextLine()); //n호
			if (n == 1) {
				bw.write(String.valueOf(n));
			} else {
				bw.write(String.valueOf(arr[k][n-1]));
			}	
			t--;
			bw.write("\n");
		}	
		bw.flush();
		bw.close();
		sc.close();
	}

}

package com.hw.basic56;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q2675 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = sc.nextInt();
		sc.nextLine(); 
		while (n > 0) {
			//또는 sc.nextInt & sc.next
			String str = sc.nextLine();
			int t = Integer.parseInt(str.split(" ")[0]);
			str = str.split(" ")[1];
			int i = 0;
			while (i < str.length()) {
				int j = 0;
				while (j < t) {
					bw.write(str.charAt(i));
					j++;
				}
				i++;
			}
			bw.write("\n");
			n--;
		}
		bw.flush();
		sc.close();
		bw.close();
		
	}
}

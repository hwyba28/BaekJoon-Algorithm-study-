package com.hw.basic34;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Q2741 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int i = 1;
		while (i<=n) {
			bw.write(String.valueOf(i));
			bw.newLine();
			i++;
		}
		bw.flush();
		bw.close();
	}
}

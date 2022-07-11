package com.hw.basic34;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
//명령어로 eof 발생시키기 전까지 end of file
public class Q10951_EOF {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		StringBuilder sb = new StringBuilder();

		while ((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str," ");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
		}
		System.out.print(sb);
	}
}

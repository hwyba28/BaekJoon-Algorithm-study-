package com.hw.basic34;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
public class Q4344 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = sc.nextInt();
		sc.nextLine();
		String str;
		int i, sum, cp;
		while(n > 0) {
			i = 0;
			sum = 0;
			str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str," ");
			int nm = st.countTokens();
			int num = Integer.parseInt(st.nextToken());//변수에 담아야함!--순서가 달라짐->while
			while(i < num) {
				sum += Integer.parseInt(st.nextToken());
				i++;
			}
			
			i = 0;
			StringTokenizer stt = new StringTokenizer(str," ");
			sum = sum/(nm-1);
			stt.nextToken();
			cp = 0;
			while(i < num) {
				if (Integer.parseInt(stt.nextToken()) > sum) {
					cp++;
				}
				i++;
			}
			//System.out.print(cp);
			//System.out.printf("%.3f",1.0*cp*100/(nm-1));
			bw.write(String.format("%.3f",1.0*cp*100/(nm-1))+"%\n");
			n--;
		}
		sc.close();
		bw.flush();
		bw.close();
	}
}

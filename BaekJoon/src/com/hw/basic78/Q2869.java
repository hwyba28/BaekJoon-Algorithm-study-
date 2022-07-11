package com.hw.basic78;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();
		
		StringTokenizer st = new StringTokenizer(s," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());


		if (a == c) {
			System.out.print(1);
		} else if (a > c)
			System.out.print(0);
		else {	
			int day = (c-a)/(a-b);
			int rday = (c-a)%(a-b);
			if (rday == 0) {
				System.out.print(day + 1);
			} else {//남은 높이
				System.out.print(day + 2);
			}
		}

	}
}




/*
int i = 1;
int num = 0;
while(num < c) {
	num += a*i - b*i;
	i++;
}
System.out.print(i);
*/

/*
 * 		if (c <= a) {
			System.out.print(1);
		} else { // c > a
			if ((c-a) > a) {
				if ((c-a)%(a-b) == 0)
					System.out.print((c-a)/(a-b) + 1);//무조건 올라가는 것에서 끝남
				else {
					if ((c-a)%(a-b) >= (a-2*b))
						System.out.print((c-a)/(a-b) + 3);
					else
						System.out.print((c-a)/(a-b) + 2);
				}
			}
			else {
				System.out.print(2);
			}
		}
*/

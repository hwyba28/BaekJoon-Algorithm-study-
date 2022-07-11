package com.hw.basic78;

import java.util.Scanner;

public class Q1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//1000
		int b = sc.nextInt();//70
		int c = sc.nextInt();//170
		sc.close();

		if (b>c) {
			System.out.print(-1);
		} else if (b == c) {
			System.out.print(-1);
		} else {
			int s = c-b;
			System.out.print((a/s) + 1);
		}
	}
}


/*반복문 - 시간초과
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();//2 
int c = sc.nextInt();//2

if (b>c) {
	System.out.print(-1);
} else if (b == c) {
	System.out.print(0);
} else {
	long i = 0;//예제 예외처리 범위
	while (i*b+a >= c*i) { //반대로 가는 조건 확실히 클떄 손익분기점
		i++;
	}
	System.out.print(i);
}
sc.close();
*/

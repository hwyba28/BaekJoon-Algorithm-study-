package com.hw.basic78;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
//Character.getNumericValue(str.charAt(0));
//두자리 수일때 에러 날 수 있으므로 " "split 또는 StringTokenizer로 공백 기준 해결
import java.util.StringTokenizer;

public class Q10250 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = sc.nextInt();
		sc.nextLine();
		while (t > 0) {
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str," ");
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			//층 (1~h층)
			int flr = n%h;
			//호수
			int num = n/h;
			
			if (flr == 0) {
				flr = h;//맨 꼭대기 층
			} else {
				num += 1;
			}
			if (num < 10)
				bw.write(Integer.toString(flr)+"0"+Integer.toString(num)+"\n");
			else
				bw.write(Integer.toString(flr)+""+Integer.toString(num)+"\n");
			t--;
		}
		
		bw.flush();
		bw.close();
		sc.close();
	}
}

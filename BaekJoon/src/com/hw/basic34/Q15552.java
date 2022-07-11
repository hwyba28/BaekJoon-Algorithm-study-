package com.hw.basic34;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int tmp = t;
		int[] arr = new int[t];
		
		while (t > 0) {
			String str = br.readLine();
			arr[tmp-t] = Integer.parseInt(str.split(" ")[0]) + Integer.parseInt(str.split(" ")[1]);
			t--;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int i = 0;
		while (i < tmp) {
			bw.write(String.valueOf(arr[i]));
			bw.newLine();
			i++;
		}
		bw.close();
	}
}

/*
 * 		// TODO Auto-generated method stub

		
		// 샘플파일이 저장된 장소를 지정해준다.
		// System.setIn(new FileInputStream("src/sample_input.txt"));
		
		// 샘플파일을 읽을 준비를 한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 샘플파일의 첫 행에 커서를 가져다 댄다.
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		// 샘플파일 첫줄에 있는 테스트 개수를 읽어온다.
		int T = Integer.parseInt(st.nextToken());
		
			for(int i=1; i<=T; i++) {
				// 커서를 다음줄로 옮긴다.
				st=new StringTokenizer(br.readLine());
				
				bw.write((Integer.parseInt(st.nextToken()) 
						+ Integer.parseInt(st.nextToken()))+ "\n");
			}
			br.close();
	
			bw.flush();
	        bw.close();
	        */
//	StringTokenizer stk=new StringTokenizer(str," ");

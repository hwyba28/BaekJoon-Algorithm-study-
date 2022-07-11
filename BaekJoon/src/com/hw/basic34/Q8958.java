package com.hw.basic34;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.StringTokenizer;
import java.io.IOException;

public class Q8958 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int n = Integer.parseInt(br.readLine());
	    //int n = Integer.valueOf(br.readLine());
	    //int n = br.read() - 48; br.readLine();//read는 한자리 정수만 읽을 수 있음//n>10인경우!
	    
	    int i;
	    int count;
	    int sum;
	    String str = "";
	    while (n > 0) {
	    	str = br.readLine();
	    	//System.out.print(str);
	    	i = 0;
	    	count = 0;
	    	sum = 0;
	    	while (i < str.length()) {
	    		if (str.charAt(i) == 'O') {
	    			count++;
	    		} else {
	    			count = 0;
	    		}
	    		sum += count;
	    		i++;
	    	}
	    	bw.write(sum+"\n");
	    	n--;
	    }
	    bw.flush();
	    br.close();
	    bw.close();
	}
}

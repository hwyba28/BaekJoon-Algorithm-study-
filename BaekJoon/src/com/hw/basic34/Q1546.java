package com.hw.basic34;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Q1546 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];//정수값 들어옴
      
      String str = br.readLine();
      br.close();
      StringTokenizer st = new StringTokenizer(str," ");

      int max = Integer.parseInt(st.nextToken());
      arr[0] = max;
      int i = 0;
      while (++i < n) {      
         arr[i] = Integer.parseInt(st.nextToken());
         if (arr[i] > max) {
            max = arr[i];
         }
      }

      i = 0;
      int sum = 0;//모든 점수가 바뀜
      while (i < n) {
         sum += arr[i];
         i++;
      }
      //System.out.println(sum);
      System.out.print(1.0*sum/max*100/n);
      br.close();
   }
}
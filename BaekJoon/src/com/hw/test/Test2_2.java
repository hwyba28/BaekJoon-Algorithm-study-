package com.hw.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2_2 {
	public static int[] solution(int[] balance, int[][] transaction, int[] abnormal) {
        
		int[] answer = {};
        List<int[]>[] list = new ArrayList[balance.length];
        
        int n = balance.length;
        int w = 0;
        while (w < n) {
            int[] arr = {w, balance[w]};
            list[w] = new ArrayList<int[]>();
            list[w].add(arr);
        	w++;
        }

        int t = transaction.length;
        int i = 0;
        while (i < t) {
        	int[] arr = {transaction[i][0]-1,transaction[i][2]};//출처, 금액
        	list[transaction[i][1]-1].add(arr);

        	while (true)
        	{
        		if (list[transaction[i][0]-1].get(list[transaction[i][0]-1].size()-1)[1] > transaction[i][2])
        		{
        			list[transaction[i][0]-1].get(list[transaction[i][0]-1].size()-1)[1] -= transaction[i][2];
        			break;
        		} else {
            		transaction[i][2] -= list[transaction[i][0]-1].get(list[transaction[i][0]-1].size()-1)[1];
            		list[transaction[i][0]-1].remove(list[transaction[i][0]-1].size()-1);
        		}
        	}
        	i++;	
        }
      
        i = 0;
        answer = new int[balance.length];
        for (int j = 0; j < balance.length; j++) {
	        while(i < list[j].size()) {
	        	if (!Arrays.asList(abnormal).contains(list[j].get(i)[0]+1)) {
	        		answer[j] += list[j].get(i)[1];
	        	}
	        	i++;
	        }
        }
        //System.out.println(answer[3]);
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr1 = {30,30,30,30};
		int[][] arr2 = {{1, 2, 10}, {2, 3, 20}, {3, 4, 5}, {3, 4, 30}};
		int[] abnormal = {1};
		System.out.println(solution(arr1,arr2,abnormal));
	}
}

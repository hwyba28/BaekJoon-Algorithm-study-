package com.hw.test2;

import java.util.HashMap;

public class Test1 {
	
    public static int[] solution(int[] p) {
    	
        int[] answer = {};
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<p.length; i++) {
        	map.put(i, 0);
        }
        
        for (int i = 0; i <p.length; i++) {
        	//p 안에서 가장 작은 숫자
        	int min = p[i];
        	int n = -1;
        	for (int j = i+1; j<p.length; j++) {
        		if (min > p[j]) {
        			min = p[j];
        			n = j;
        		}
        	}
        	//min 가장 작은 숫자 찾기 완료
        	if (n != -1) { // 가장 작지 않다면 바뀌기 시작!
	        	int tmp = p[i];
	        	p[i] = min;
	        	p[n] = tmp;
	        	
	            map.put(i, map.get(i)+1);
	            map.put(n, map.get(n)+1);
        	}
        }
        
        answer = new int[p.length];
        for (int i = 0; i< p.length ; i++) {
        	answer[i] = map.get(i);
        }
        return answer;
    }
	
	
	
	public static void main(String[] args) {
		int[] p = {2, 5, 3, 1, 4};
		System.out.println(solution(p));
	}
}

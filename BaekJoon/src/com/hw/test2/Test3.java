package com.hw.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.List;

public class Test3 {

    public static int[] solution(int n, String[] plans, String[] clients) {
        int[] answer = {};
        answer = new int[clients.length];
        Arrays.fill(answer, 0);
             
        //1. plan을 int형 2차원 배열로 전환(비교위해)
        List<Integer>[] plan = new ArrayList[plans.length];
        for (int i = 0; i < plans.length; i++) {
        	StringTokenizer st = new StringTokenizer(plans[i], " ");
    		plan[i] = new ArrayList<Integer>();
        	while(st.hasMoreTokens()) {
        		plan[i].add(Integer.parseInt(st.nextToken()));
        		//System.out.println(st.nextToken());
        	}

        	//이전 부가세 포함
        	if (i > 0) {
    			List<Integer> tmp = new ArrayList<>(plan[i-1]);
    			tmp.remove(0);
        		plan[i].addAll(tmp);
        	}
        }

       
        //2. client을 int형 2차원 배열로 전환(비교위해)
        List<Integer>[] client = new ArrayList[clients.length];
        for (int i = 0; i < clients.length; i++) {
        	StringTokenizer st = new StringTokenizer(clients[i], " ");
    		client[i] = new ArrayList<Integer>();
        	while(st.hasMoreTokens()) {
        		client[i].add(Integer.parseInt(st.nextToken()));
        	}
        }
        
        for(int i = 0; i < clients.length; i++) {
        	for (int j = 0; j < plans.length; j++) {
        		//요금제 우선 확인

        		if (client[i].get(0) <= plan[j].get(0)) {
        			List<Integer> tmp = new ArrayList<>(client[i]);
        			tmp.remove(0);
        			if (plan[j].containsAll(tmp)) {
        				answer[i] = j+1;
        				break;
        			}
        		}
        	}
        }
        
        
        
        
        
        return answer;
    }
    
    //배열 변환
	public static void main(String[] args) {
		int n = 3;
		String[] plans = {"150 1", "500 4", "2000 5"};
		String[] clients = {"100 4 1", "50 1 2", "1000 1"};
		int[] answer = solution(n,plans,clients);
		System.out.println(answer[0]);//2
		System.out.println(answer[1]);//0
		System.out.println(answer[2]);//3

	}
}

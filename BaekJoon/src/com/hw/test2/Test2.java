package com.hw.test2;

import java.util.Arrays;

public class Test2 {
	//고객 가입기간 / (i+1)번 고객의 
	//고객 납부내역(2차원)
	//고객 다음달 납부 예정금액 - vip 기준
	
	//행------고객명
	//열 - 개월
	
	//answer => 다음달 vip가 되는 고객수, vip에서 없어지는 고객수  (변경 기록)
    public static int[] solution(int[] periods, int[][] payments, int[] estimates) {
        int[] answer = {};
        answer = new int[2];
        Arrays.fill(answer, 0);

        int[] before = new int[periods.length];
        
        int[] now = new int[periods.length];
        //Arrays.fill(now, -1);//해당없음 -1
        
        //1. 각 고객별 현재 vip여부 (1,0)
        for (int i = 0; i < periods.length; i++) {
        	int sum1 = 0;
        	int sum2 = 0;
        	
        	for(int j = 0; j < 12; j++) {
        		sum1 += payments[i][j];
        	}
        	
        	System.out.println("원래 금액"+sum1);
        	
        	for(int j = 1; j < 12; j++) {
        		sum2 += payments[i][j];
        	}
        	sum2 += estimates[i];
        	
        	System.out.println("현재 금액"+sum2);

        	//원래 vip였는지 아닌지
        	if ((periods[i] >= 60 && sum1 >= 600000) || ((periods[i]) >= 24) && (sum1 >= 900000)) {
        		before[i] = 1;
        	} else {
        		before[i] = 0;
        	}
        	System.out.println(i+"번 고객 원래:"+before[i]);
        	
        	//period를 1씩 늘려줘야 함
        	periods[i] += 1;
        	
        	//현재 vip인지 아닌지
        	if ((periods[i] >= 60 && sum2 >= 600000) || ((periods[i]) >= 24) && (sum2 >= 900000)) {
        		now[i] = 1;
        	} else {
        		now[i] = 0;
        	}
        	System.out.println(i+"번 고객 현재:"+now[i]);


        	//vip 해당되는 인물
        	if (now[i] == 1 && before[i] == 0) {
        		answer[0] += 1;
        	}
        	if (now[i] == 0 && before[i] == 1) {
        		answer[1] += 1;
        	}
        }
        return answer;
    }
    
    
	public static void main(String[] args) {
		int[] periods = {20, 23, 24}; // 가입기간 +1?
		int[][] payments = {{100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000}, {100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000}, {350000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000}};
		int[] estimates = {100000, 100000, 100000};
		
		int answer[] = solution(periods,payments,estimates);
		System.out.println(answer[0] +" "+ answer[1]);
	}
}

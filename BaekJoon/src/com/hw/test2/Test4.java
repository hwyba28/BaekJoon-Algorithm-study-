package com.hw.test2;

public class Test4 {
	//다익스트라?
	//. 평지
	//F 숲
	//# 강
    public static int solution(String[] grid, int k) {
        int answer = -1;
        //이동안 탐험
        int day = 2;
        //while (k + day < grid.length + grid[0].length()) {
        	//출발점 부터 k보다 작은 동안은 계속 야영을 해야함
        	//최대한 평지로 이동 // k가 매우 작은경우?
        	
        	//게임 가듯이 좌우 움직임
        	//길을 먼저 만들기
        	for (int i = 0; i < grid.length; i++) {
        		if (day + k >= grid.length + grid[0].length())
        			break;
        		answer += 1;
        		for (int j =0; j< grid[0].length(); j++) {
        			for(int l=0; l < k; l++) {
        				if (i+1 < grid.length && grid[i+1].charAt(j) == '.')
        					i++;
        				else if (j+1 < grid[0].length() && grid[i].charAt(j+1) == '.')
        					j++;
        				else if (i+1 < grid.length && grid[i+1].charAt(j) == 'F') {
        					if (l == k-1) {
        						day = l;
        						break;
        					}
        					i++;
        				}
        				else if (j+1 < grid[0].length() && grid[i].charAt(j+1) == 'F') {
        					if (l == k-1) {
        						day = l;
        						break;
        					}
        					j++;
        				}
        				else {
        					i--;
        					j--;
        				}
        				day = l; 
        			}
        		}
        	}
        //}
        return (answer+1);
    }
    //핵심은 알고리즘/문법
	public static void main(String[] args) {
		String[] grid = {"..FF", "###F", "###."};
		/*
		 ..FF
		 ###F
		 ###.
		 */
		int k = 4;
		int answer = solution(grid,k);
		System.out.println(answer);//1
	}
}

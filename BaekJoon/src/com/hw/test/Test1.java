package com.hw.test;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
	
    public static int solution(int[][] cards1, int[][] cards2) {
        int answer = 0;
        
        int n = cards1.length;

        int r = 0; //round
        Set<Integer> error = new HashSet<Integer>();
        while (r < n) {
        	Set<Integer> cards = new HashSet<Integer>();

        	cards.add(cards1[r][0]);
        	cards.add(cards1[r][1]);
        	cards.add(cards1[r][2]);
        	cards.add(cards1[r][3]);
        	cards.add(cards1[r][4]);
        	cards.add(cards2[r][0]);
        	cards.add(cards2[r][1]);
        	cards.add(cards2[r][2]);
        	cards.add(cards2[r][3]);
        	cards.add(cards2[r][4]);
        	
        	if (cards.size() != 10)
        		error.add(r);
        	r++;
        }
        
        r = 1;
        while (r < n) {
        	//여기서는 이전 중복과 자체 중복을 구분해야함
        	//꼼꼼
        	Set<Integer> cards11 = new HashSet<Integer>();
        	Set<Integer> cards12 = new HashSet<Integer>();

        	Set<Integer> cards21 = new HashSet<Integer>();
        	Set<Integer> cards22 = new HashSet<Integer>();

        	cards11.add(cards1[r][0]);
        	cards11.add(cards1[r][1]);
        	cards11.add(cards1[r][2]);
        	cards11.add(cards1[r][3]);
        	cards11.add(cards1[r][4]);
        	cards12.add(cards1[r-1][0]);
        	cards12.add(cards1[r-1][1]);
        	cards12.add(cards1[r-1][2]);
        	cards12.add(cards1[r-1][3]);
        	cards12.add(cards1[r-1][4]);     	
        	int size1 = cards11.size() + cards12.size();
        	cards11.addAll(cards12);
        	
        	cards21.add(cards2[r-1][0]);
        	cards21.add(cards2[r-1][1]);
        	cards21.add(cards2[r-1][2]);
        	cards21.add(cards2[r-1][3]);
        	cards21.add(cards2[r-1][4]);
        	cards22.add(cards2[r][0]);
        	cards22.add(cards2[r][1]);
        	cards22.add(cards2[r][2]);
        	cards22.add(cards2[r][3]);
        	cards22.add(cards2[r][4]);
        	int size2 = cards21.size() + cards22.size();
        	cards22.addAll(cards21);
        	
        	if (cards11.size() < size1-1 || cards22.size() < size2-1)
        		error.add(r);

        	r++;
        }
        answer = error.size();
        return answer;
    }
    
	public static void main(String[] args) {
		int[][] arr1 =  {{1, 12, 15, 21, 32}, {16, 26, 34, 46, 52}, {9, 11, 16, 16, 21}, {3, 8, 10, 16, 20}};
		int[][] arr2 = {{6, 14, 15, 19, 46}, {5, 42, 43, 51, 52}, {5, 6, 11, 13, 45}, {5, 9, 11, 13, 45}};
		System.out.println(solution(arr1, arr2));
	}
}

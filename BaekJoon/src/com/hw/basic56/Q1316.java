package com.hw.basic56;

//import java.util.Arrays;
//import java.util.HashSet;
import java.util.Scanner;
//import java.util.Set;

public class Q1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		int i = 0;
		int count = 0;
		while (i < n) {
			String str = sc.nextLine();
			if (str.length() == 1) {
				//continue; continue할게 없을때 단어 1개일때 런타임 에러
			} else {
				boolean check = true;
				int j = 0;
				while (j < str.length()-1) {
	
					if (str.charAt(j) != str.charAt(j+1)) {
						int k = j+2;
						while (k < str.length()) {
							if(str.charAt(k) == str.charAt(j)) {
								check = false;
								break;
							}
							k++;
						}
						if (!check) {
							count++;
							break;
						}
					}
					j++;
				}
			}
			i++;
		}
		System.out.print(n-count);
		sc.close();
	}
}



/*  아래는 중복자체가 안되는 경우의 코드
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.nextLine();

int i = 0;
int count = 0;
while (i < n) {
	String str = sc.nextLine();
	Set<String> s = new HashSet<String>(Arrays.asList(str.split("")));
	if (s.size() == str.length())
		count++;
	i++;
}
System.out.print(count);
}
*/
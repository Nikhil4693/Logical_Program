package com.programs.string;

import java.util.Scanner;

public class Rough {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = "ankurnikkur";
		char[] arr = s.toCharArray();
		int nc = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = 1 + i; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					int k = j;
					while (k < n-1) {
						arr[k] = arr[k + 1];
						k++;
					}
//					n--;
					j--;
				}
			}
			System.out.println("count of " + arr[i] + " is " + count);
		}
	}
}

package com.example.demo;

public class fabbinacciSeries {
	
public static void main(String args[]) {
	int n=10;
	System.out.println("Fabbinacci series"  +  n  +  "term");
	for(int i=0; i<n; i++) {
		System.out.println(fabbinacci(i) + " ");
	}

	}
public static  int fabbinacci(int n) {
	if (n<=1) {
		return n;
		
	}else {
		return fabbinacci(n-1) + fabbinacci(n-2);
		
	}
}
}

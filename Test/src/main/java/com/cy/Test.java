package com.cy;

import java.util.Arrays;

public class Test {
	private static int i=1;
	public static void main(String[] args) {
		
		int []a= {13,15,6,80,60,75,50};
		Arrays.sort(a);
		
		int [] b=Arrays.copyOf(a, a.length+i);
		int [] c=Arrays.copyOf(a, a.length-i);
		System.out.println(Arrays.toString(a));
	}
}

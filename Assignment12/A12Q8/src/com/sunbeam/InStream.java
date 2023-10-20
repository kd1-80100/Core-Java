package com.sunbeam;

import java.util.stream.IntStream;
public class InStream {
	public static void main(String[] args) {
		IntStream str=IntStream.range(1, 10);
		int total=str.sum();
		System.out.println("sum of 0 to 9 numbers using instream sum():"+total+"\n");
		
		IntStream str1=IntStream.range(1, 10);
		System.out.println("Summary using Instream:"+str1.summaryStatistics());
	}
}

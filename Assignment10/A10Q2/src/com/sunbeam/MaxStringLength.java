package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxStringLength {
public static void main(String[] args) {
		
		class Findmax implements Comparator<String>
		{

			@Override
			public int compare(String s1, String s2) {
				int diff = (s1.length() - s2.length());
				return diff;
			}
			
		}
		Findmax cmp = new Findmax();
		List<String> list= new ArrayList<String>();
		list.add("Pavan");
		list.add("Pranav");
		list.add("Subhash");
		list.add("Geeta");
		
		String str= Collections.max(list,cmp);
		System.out.println("max string name is "+ str);

		
	}
}

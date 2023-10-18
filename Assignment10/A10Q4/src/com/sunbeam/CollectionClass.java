package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionClass {
	public static void main(String[] args) {

//		Collection<String> c = new ArrayList<>();
//		Collection<String> c = new HashSet<>();
//		Collection<String> c = new LinkedHashSet<>();
		Collection<String> c = new TreeSet<>();
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add("C");
//		c.add(null);
//		c.add(null);
//		c.add(null);
		System.out.println(c.toString());
	}
}
/*
 * 1. ArrayList: Duplicates allowed,null allowed,multiple null allowed,insertion order maintained. 
 * 2. HashSet: Duplicates not allowed,null allowed,multiple null not allowed,insertion order not maintained.
 * 3. LinkedHashSet: Duplicates not allowed,null allowed,multiple null not allowed,insertion order maintained.
 * 4. TreeSet:	Duplicates not allowed,null not allowed,insertion order not maintained.
 */

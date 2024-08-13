package com.coll;

import java.util.*;
// hashoperator %no of bucket 
public class HashSetDemo {
	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add("snehal");
		ls.add("snehal");
		ls.add("sourav");
		ls.add("suhani");
	Set<String> hset = new HashSet<>();
	hset.addAll(ls);
	System.out.println(hset);
		
	}
}

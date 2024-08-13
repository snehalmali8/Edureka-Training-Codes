package com.coll;
import java.util.*;
import java.util.Map.Entry;
public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer , String> ht = new Hashtable<>();
		ht.put(1, "Snehal");
		ht.put(2, "Sourav");
		ht.put(3, "Snehal");
		
		System.out.println(ht.getOrDefault(4, "Suhani"));
		ht.putIfAbsent(6, "Suhani");
		 System.out.println("By Enumeration...");
		Enumeration<Integer> en = ht.keys();
		while(en.hasMoreElements()) {
			int key = en.nextElement();
			System.out.println(key+" " + ht.get(key));
		}
		System.out.println("By EntrySet");
		Set<Entry<Integer, String>> setEntry = ht.entrySet();
		for(Entry<Integer, String> en1 : setEntry){
			System.out.println(en1.getKey() + " " + en1.getValue());
		}
	}

}

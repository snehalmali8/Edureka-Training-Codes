package com.org;

import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("snehal");
	list.add("sourav");
	list.add("Patil");
	list.add("sourav");
	// creating the stream
	//simple stream
	Stream<String> str = list.stream();
	// Parallel stream used to improve the performance on multi core processors
	Stream<String> str2 = list.parallelStream();
	
	int[] arr = {1,2,3,4,5,6,7};
	IntStream s = Arrays.stream(arr);
	//int stream is a class of stream interface, it represent stream of primitive int valued elements
	
	// this method always accepts only mandatory values and
	// 3) stream.of(T t) return sequential stream containing single specified element
	// 2) stream.of(T... values) = return a sequential ordered stream whose elements are the specified values
	Stream<String> str3 = Stream.of("mali", "patil");
	
	// filter(): Filters elements based on a predicate
	List<String> filtered = list.stream().filter(x -> x.startsWith("s")).collect(Collectors.toList());
	System.out.println(filtered);
	// collect method accept how to the element of the stream should be collected and aggregated as an argument
	// map(): Transform elements using a function
	//map method is a functional operation that transform each element in a string by applyinh specified function to it
	// map method return new stream consisting of transform element, it can be use to convert stream of objects of one 
	// type to stream of objects to anther type
	// extracts the specific property of field from each object in a stream
	List<Integer> lengths = list.stream().map(String::length).collect(Collectors.toList());
	System.out.println(lengths);
	
	//sorted(): sorts elements
	List<String> sorted = list.stream().sorted().collect(Collectors.toList());
	System.out.println(sorted);
	
	// distinct(): Return the distinct elements from the list
	List<String> distinct = list.stream().distinct().collect(Collectors.toList());
	System.out.println(distinct);
	
	// flatMap() : flatMap is a method , when apply to a stream value it maps each value some required output value.
	// mapping and transformation to inout to output takes place via mapper which is functional interface
	// it is similar how map function works but flatMap is different bcoz it also flatans result into single collection of item
	// we apply flatMap to avoid nested structure
	//flatMap is equal to map function + flatName
	List<List<Integer>> ls = Arrays.asList(
			Arrays.asList(1,2),
			Arrays.asList(3,4),
			Arrays.asList(5,6)
			);
	
	
	try {
		Stream<String> s01 = Files.lines(Paths.get("/home/labuser/eclipse-workspace/StreamDemo/src/com/org/hello.txt"));
        s01.forEach(System.out::println);
	} 
	catch (Exception e) {
		// TODO: handle exception
	}
	
	}
}

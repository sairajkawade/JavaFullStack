package com.velocity;
import java.util.*;
public class ArrayListDemo1 {
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		// add elements
		list.add("ram");
		list.add("shyam");
		list.add("baban");
		list.add("yogesh");
		list.add("avinash");
		Collections.sort(list);
		System.out.println("*** Sorted names are below ***");
		
		for(String str : list) {
			System.out.println(str);
		}
	}

}

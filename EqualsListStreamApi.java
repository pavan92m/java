package com.nt.steamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EqualsListStreamApi {
	public static void main(String[] args) {
		List<String> list1= new ArrayList<String>();
		list1.add("1");
		list1.add("pavan");
		list1.add("pratap");
		list1.add("Singh");
		
		list1.forEach(System.out::println); 
		
		List<String> list2= new ArrayList<String>();
		list2.add("1");
		list2.add("pp");
		list2.add("ss");
		list2.add("KK");

		List<String> available = list1.stream()
                .filter(e -> list2.contains(e))
                .collect(Collectors.toList());
		available.forEach(System.out::println); 
		
	}

}

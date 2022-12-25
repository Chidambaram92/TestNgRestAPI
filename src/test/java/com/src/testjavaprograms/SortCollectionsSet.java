package com.src.testjavaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortCollectionsSet {
	public static void main(String[] args) {
		testSort();
	}

	private static void testSort() {
		Set<String>newSetValue=  new HashSet<String>();
		newSetValue.add("Kettle");
		newSetValue.add("Brough");
		newSetValue.add("Johanson");
		newSetValue.add("Senit");
		newSetValue.add("Frokit");
		System.out.println("Before Sorting the Hash Set values are :");
		for(String sValue:newSetValue) {
			System.out.println(sValue);
		}
		System.out.println("After  Sorting through collections the Hash Set values are :");
	List<String>arrList= new ArrayList<>(newSetValue);
	Collections.sort(arrList);
	for(String sArray:arrList) {
		System.out.println(sArray);
	}
	System.out.println("After  Sorting through Tree Set the values are :");
	Set<String>treeValue= new TreeSet<>(newSetValue);
	for(String stValue:treeValue) {
		System.out.println(stValue);
	}
	}

}

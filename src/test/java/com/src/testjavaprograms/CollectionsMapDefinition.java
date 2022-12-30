package com.src.testjavaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CollectionsMapDefinition {
	public static <K, V> void main(String[] args) {
		Map<String,Integer>hMapOne=new HashMap<String,Integer>();
		   hMapOne.put("test", 32);
		   hMapOne.put("show", 14);
		   hMapOne.put("big", 20);
		   hMapOne.put("defg",12);
		   hMapOne.put("crick", 10);
		   Map<String,Integer>treeMapLi=new TreeMap<String,Integer>(hMapOne);
		 for(Entry<String, Integer> entries:treeMapLi.entrySet()) {
			 System.out.println("Key = " + entries.getKey() +
                     ", Value = " + entries.getValue());
		 }
	}
	
}

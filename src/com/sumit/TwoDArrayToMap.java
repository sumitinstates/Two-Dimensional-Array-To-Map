package com.sumit;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoDArrayToMap {
	
	static void convertToMap(String arr [] []) {
		
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
		
		for(int i=0;i<arr.length;i++) 
		{
			String Key = arr[i][0];
			String value = arr[i][1];
			
			if(!hm.containsKey(Key)) 
			{
				ArrayList<String> al = new ArrayList<String>();
				al.add(value);
				hm.put(Key, al);
			} 
			else 
			{
				ArrayList<String> arrayList = hm.get(Key);
				arrayList.add(value);
				hm.put(Key, arrayList);
			}
		}
		
		for(String s : hm.keySet()) 
		{
			System.out.println("Key is : " + s);
			System.out.println("Value is : " + hm.get(s));
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		String st [][] = 
	    {
				{"Fruits","Apple"},
				{"Colors","Blue"},
				{"Animals", "Lions"},
				{"Fruits","Mango"},
				{"Colors","Black"},
				{"Animals", "Dogs"},
				{"Fruits","Strawberry"},
				{"Colors","Pink"},
				{"Animals", "Horses"},		
		};
		
		TwoDArrayToMap.convertToMap(st);
			
	}
}

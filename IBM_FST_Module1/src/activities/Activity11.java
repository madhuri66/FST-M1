package activities;

import java.util.HashMap;

public class Activity11 
{
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Red");
		hm.put(2, "Blue");
		hm.put(3, "Pink");
		hm.put(4, "Green");
		hm.put(5, "Orange");
		hm.put(6, "Violet");
		hm.put(7, "Black");
		
		System.out.println("The Original Map is: " +hm);
		hm.remove(5);
		System.out.println("After removing Orange" +hm);
		
		if(hm.containsValue("Green"))
		{
			System.out.println("Green exist in the Map");
		} else {
			System.out.println("Green does not exist in the Map");
		}
		
		System.out.println("Number of pairs in the map is: " +hm.size());
		
		for(int key : hm.keySet())
		{
			System.out.println(hm.get(key));
		}
	}
}

package activities;

import java.util.HashSet;

public class Activity10 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<>();
		hs.add("M");
		hs.add("B");
		hs.add("C");
		hs.add("P");
		hs.add("Z");
		hs.add("X");
		
		System.out.println("Original HastSet : " +hs);
		System.out.println("Size of HashSet : " +hs.size());
		System.out.println("Removing P from hashSet : " +hs.remove("P"));
		
		if(hs.remove("A"))
		{
			System.out.println("A removed from the Set");
		}else {
			System.out.println("A is not Present in the set");		
			}
		System.out.println("Checking if M is present in the set: " +hs.contains("M"));
		System.out.println("Updated HashSet : " +hs);
	}

}

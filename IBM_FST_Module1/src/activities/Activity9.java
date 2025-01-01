package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 
{
	public static void main(String[] args) 
	{
		List<String> myList = new ArrayList<>();
		myList.add("Apple");
		myList.add("Mango");
		myList.add("Papaya");
		myList.add(1, "Pineapple");
		myList.add(3, "Melon");
		
		for(String name : myList)
		{
			System.out.println(name);
		}
		System.out.println("The third element is:" +myList.get(2));
		System.out.println("Is Melon in the list ? " +myList.contains("Melon"));
		System.out.println("Original size of the list is: " +myList.size());
		myList.remove(3);
		myList.remove("Papaya");
		System.out.println("size of the list after removing some items: " +myList.size());
	}
}

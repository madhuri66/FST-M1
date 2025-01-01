package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> numArr = new ArrayList<>();
		Random indexGen = new Random();
		
		System.out.println("Enter the numbers of the list");
		System.out.println("Enter EOL or any non-integer character to stop");
		
		while(scan.hasNextInt())
		{
			numArr.add(scan.nextInt());
		}
		System.out.println("Total number of Values in ArrayList : " + numArr.size());
		
		int generatedIndex = indexGen.nextInt(numArr.size()); 
        
		System.out.println("Random index generated: " + generatedIndex);
        System.out.println("Value in arary at generated index is: " + numArr.get(generatedIndex));
 
        scan.close();
	}
}

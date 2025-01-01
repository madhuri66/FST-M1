package activities;

@FunctionalInterface
interface Addable 
{
    int add(int a, int b);
}

public class Activity12 
{
	public static void main(String[] args) 
	{
		 Addable addObj1 = (a, b) -> (a + b);
	     System.out.println(addObj1.add(10, 20));
	     
	     Addable addObj2 = (int a, int b) -> {
	    	 return (a + b);
	    	 };
	    System.out.println(addObj2.add(100, 200));
	}
}

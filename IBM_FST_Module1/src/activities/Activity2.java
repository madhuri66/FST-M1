package activities;

public class Activity2 {
	public static void main(String[] args) {
		Activity2 obj2=new Activity2();
		int nums[]= {10,77,10,54,-11,10};
		int searchNum=10;
		int fixedSum=30;
		System.out.println("Result : " +obj2.result(nums, searchNum, fixedSum));
	}
	
	public boolean result(int[] nums, int searchNum, int fixedSum)
	{
		int tempSum = 0;
		for(int number : nums)
		{
			if(number==searchNum)
			{
				tempSum+=searchNum;
			}
			if(tempSum>fixedSum)
			{
				break;
			}
		}	
		return fixedSum == tempSum;
	}
}

package activities;

class CustomerException extends Exception
{
	private String message = null;	
	public CustomerException(String message) 
	{
		this.message=message;
	}	
	@Override
	public String getMessage() {
		return message;
	}
}
public class Activity8 
{
	public static void main(String[] args) 
	{
		try {
			Activity8.exceptionTest("Will print to console");
			Activity8.exceptionTest(null);
			Activity8.exceptionTest("Won't execute");			
		}catch (CustomerException ex) {
			System.out.println("Inside catch block:" + ex.getMessage());
		}
	}
	static void exceptionTest(String str) throws CustomerException{
		if(str == null) {
			throw new CustomerException("String value is null");
		}else {
			System.out.println(str);
		}
	}
}

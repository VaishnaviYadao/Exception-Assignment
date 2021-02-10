package ExceptionAssignment;

class AgeException extends Exception {
	
	String msg;
	public AgeException(String msg) {
		
		super(msg);
		this.msg=msg;
		System.out.println("Checking eligibility for vote:");
	}
}

class User
{
	void CheckAge(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("You are not eligible for vote");
		}
		else
		{
			System.out.println("You are eligible for vote");
		}
		
	}
}
public class TestApp
{
	public static void main(String[] args) throws AgeException
	{
		User c=new User();
		c.CheckAge(20);
	}
	}
	

	
	

	
	

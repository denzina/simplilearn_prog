import java.util.Scanner;

class UnderAgeException extends Exception
{
	public String toString()
	{
		return "Under age";
		
	}
}
class OverAgeException extends Exception
{
	public String toString()
	{
		return "Over age";
		
	}
}
class Person
{
	int age;
	
		void collectData()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter age");
			age=sc.nextInt();
		
		}
		void verify() throws  OverAgeException, UnderAgeException
		{
			if(age<18)
			{
				UnderAgeException ua=new UnderAgeException();
				System.out.println(ua.toString());
				throw ua;
			}
				
			else if(age >65)
			{
				OverAgeException oa=new OverAgeException();
				System.out.println(oa.toString());
				throw oa;
			}
			else
			{
				System.out.println("give licence");
		}
	}
	
}
class RTO
{
	void personCheck()
	{
		Person p=new Person();
		p.collectData();
		try
		{
			p.verify();
		}
		catch(OverAgeException e)
		{
			System.out.println(e.toString());
		}
		catch(UnderAgeException e) {
			System.out.println(e.toString());
		}
	}
}
public class customexpdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RTO r=new RTO();
		r.personCheck();
	}

}

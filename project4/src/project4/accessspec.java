package project4;


	
	class defaulteaccess//same package
	{
		 void display()
		{
			System.out.println("Default");
		}
	}

	class privateaccess//only within same class
	{
		 private void display()
		{
			System.out.println("private");
		}
	}
	class protectaccess//same package and inheritance class
	{
		 protected void display()
		{
			System.out.println("protected");
		}
	}
	public class accessspec {
	public static void main(String[] args) 
	{

		defaulteaccess a2=new defaulteaccess();
		a2.display();
		privateaccess a1=new privateaccess();
	//	a1.display();
		protectaccess a3=new protectaccess();
		a3.display();
		
		
	}

}

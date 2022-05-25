class operations extends Thread
{
	public void run()
	{
		if(Thread.currentThread().getName().equals("add"))
		{
			add();
		}
		else if(Thread.currentThread().getName().equals("sub"))
		{
			sub();
		}
		else if(Thread.currentThread().getName().equals("mul"))
		{
			mul();
		}
		else
			div();
	}
	void add()
	{
		System.out.println("add");
	}
	void sub()
	{
		System.out.println("sub");
	}
	void mul()
	{
		System.out.println("mul");
	}
	void div()
	{
		System.out.println("div");
	}
}
public class threaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operations op1=new operations();
		operations op2=new operations();
		operations op3=new operations();
		operations op4=new operations();
		op1.setName("add");
		op2.setName("sub");
		op3.setName("mul");
		op4.setName("div");
		op1.start();
		op2.start();
		op3.start();
		op4.start();
	}

}

class operations1 implements Runnable 
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

public class impthreaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operations1 op1=new operations1();
		operations1 op2=new operations1();
		operations1 op3=new operations1();
		operations1 op4=new operations1();
		Thread t1=new Thread(op1);
		Thread t2=new Thread(op2);
		Thread t3=new Thread(op3);
		Thread t4=new Thread(op4);
		t1.setName("add");
		t2.setName("sub");
		t3.setName("mul");
		t4.setName("div");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

	}



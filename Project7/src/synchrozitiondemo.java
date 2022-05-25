class sender
{
	public void send(String msg)
	{
		System.out.println("sending"+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(msg+"sent");
	}
}
class Threadsend extends Thread
{
	private String msg;
	private Thread t;
	sender sender;
	Threadsend(String m,sender obj)
	{
		msg=m;
		sender=obj;
		
	}
	public void run()
	{
		synchronized(sender)
		{
			sender.send(msg);
		}
	}
	
}
public class synchrozitiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sender snd=new sender();
		Threadsend s1= new Threadsend("hi",snd);
		Threadsend s2=new Threadsend("bye",snd);
		s1.start();
		s2.start();
		try
		{
			s1.join();
			s2.join();
		}
		catch(Exception e)
		{
			System.out.println("interuppted");
		}
	}

}


public class sleepwaitdemo {
	private static Object LOCK=new Object();
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
			Thread.sleep(1000);
			System.out.println("thread "+Thread.currentThread().getName()+" is woke after sleep");
		synchronized (LOCK) 
		{
			LOCK.wait(5000);
			System.out.println("object"+LOCK+"is woken afte"+" waiting for 5 sec");
		}
		
		
	}

}

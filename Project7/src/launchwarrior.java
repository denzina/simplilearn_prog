class warrior extends Thread
{
	String res1="weapon-1";
	String res2="weapon-2";
	String res3="weapon-3";
	
		public void run()
		{
			try
			{
				if(Thread.currentThread().getName().equals("RAMA"))
				{
					ramaRes();

				}
				else
				{
					ravanaRes();
				}
			}
	
	catch(Exception e) 
	{
		e.printStackTrace();
	}
}

	private void ravanaRes() throws InterruptedException{
		// TODO Auto-generated method stub
		synchronized (res1) {//res3
			System.out.println("ravana has"+res1);
			Thread.sleep(4000);
			synchronized (res2) {
				System.out.println("ravana has"+res2);
				Thread.sleep(4000);
				synchronized (res3) {//res1 this will lead to deadlock
					//to overcome this 
					System.out.println("ravana has"+res3);
					Thread.sleep(4000);
				}
			}
		}
	}

	private void ramaRes() throws InterruptedException {
		// TODO Auto-generated method stub
		synchronized (res1) {
			System.out.println("rama has"+res1);
			Thread.sleep(4000);
			synchronized (res2) {
				System.out.println("rama has"+res2);
				Thread.sleep(4000);
				synchronized (res3) {
					System.out.println("rama has"+res3);
					Thread.sleep(4000);
				}
			}
		}
		
		
	}
	
}
public class launchwarrior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		warrior w1=new warrior();
		warrior w2=new warrior();
		w1.setName("RAMA");
		w2.setName("RAVANA");
		w1.start();
		//w1.join();this will overcome deadlock 
		//join means untill rama completesthe task and use the resourse ravana has to wait
		w2.start();
	}

}

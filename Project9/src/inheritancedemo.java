class bycycle
{
	public int gear;
	public int speed;
	public bycycle(int gear,int speed)
	{
		this.gear=gear;
		this.speed=speed;
	}
	public void applyBrake(int decrement)
	{
		speed-=decrement;
	}
	public void speedup(int increment)
	{
		speed+=increment;
	}
	public String toString()
	{
		return("no of gear"+gear+" "+ "spped of cycle is"+speed);
	}
}
class MountBike extends bycycle
{
	public int seatHeight;
	
		public MountBike(int gear,int speed,int startHeight)
		{
			super(gear,speed);
			seatHeight=startHeight;
		}
		public void setHeight(int newValue)
		{
			seatHeight=newValue;
		}
		public String toString()
		{
			return(super.toString()+ " "+"seatHeight"+seatHeight);
		}

	
}
public class inheritancedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MountBike m=new MountBike(3,100,25);
    System.out.println(m.toString());
	}

}

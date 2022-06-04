interface First
{
	
	default void show()
	{
		System.out.println("default first");
	}
}
interface Second
{
	default void show()
	{
		System.out.println("default second");
	}
}
public class diamondDemo implements First,Second{
	public void show()
	{
		First.super.show();//super will refer the method inside interface
		Second.super.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diamondDemo d=new diamondDemo();
		d.show();
	}

}

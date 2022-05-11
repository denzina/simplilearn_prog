abstract class AnonymousInnerClass
{
	public abstract void display();
	
}
public class innerabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClass i=new AnonymousInnerClass()
				{
		public void display()
		{
			System.out.println("hello");
		}
	};
	i.display();
	}
}

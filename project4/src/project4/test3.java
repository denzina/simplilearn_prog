package project4;
class car
{
	String color;
	int model;
	int year;
	void move()
	{
		System.out.println(color+"\n"+model+"\n"+year);
	}
}
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car();
		c.color="red";
		c.model=2345;
		c.year=2019;
		c.move();
		//Implicit type casting
		char a='A';
		System.out.println(a);
		int b=a;
		System.out.println(b);
		float c1=a;
		System.out.println(c1);
		double d=a;
		System.out.println(d);
		//explicit type casting
		float x=45.99f;
		int y=(int)x;
		char z=(char)y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}

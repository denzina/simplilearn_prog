import java.util.Scanner;
//through abstraction we will enforce method overriding
abstract class Shapes
{
	double area;
	abstract void getData();
	abstract void calculate();
	void display()
	{
		System.out.println("the area is "+area);
	}
}
class Circle extends Shapes
{
	float r;
	float pi=3.14f;
	@Override
	void getData() {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		r=sc.nextFloat();
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		area=pi*r*r;
	}
	
}
class Square extends Shapes
{
	float s;
	@Override
	void getData() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side");
		s=sc.nextFloat();
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		area=s*s;
	}
	
}
class Rect extends Shapes
{
	float l,b;
	@Override
	void getData() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		l=sc.nextFloat();
		System.out.println("enter the breadh");
		b=sc.nextFloat();
	}

	@Override
	void calculate()
	{
		// TODO Auto-generated method stub
		area=l*b;
	}
	
}
public class abstractdemo {
	public static void main(String[] args) {
		Circle c=new Circle();
		Rect rc=new Rect();
		Square sq=new Square();
		c.getData();//overridden
		c.calculate();//overridden
		c.display();//inherited
		rc.getData();
		rc.calculate();
		rc.display();
		sq.getData();
		sq.calculate();
		sq.display();
		
	}
}

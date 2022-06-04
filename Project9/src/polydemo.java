
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
//for shapes we cannot create opect but crete as a variable of abstract
class Geometry
{
	void usage(Shapes s)
	{
		s.getData();
		s.calculate();
		s.display();
	}
}
public class polydemo {
	public static void main(String[] args) {
		Circle c=new Circle();
		Rect rc=new Rect();
		Square sq=new Square();
		Shapes s;
//		s=c;//s is equal to address of object pointed by c
//		s.getData();//overridden
//		s.calculate();//overridden
//		s.display();//inherited
//		s=rc;//s is equal to address of object pointed by rc
//		s.getData();
//		s.calculate();
//		s.display();
//		s=sq;//s is equal to address of object pointed by sq
//		s.getData();
//		s.calculate();
//		s.display();
//		since too much lines of code we are replacing it by
		Geometry g=new Geometry();
		g.usage(c);
		g.usage(rc);
		g.usage(sq);
	}
}


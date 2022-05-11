class dog extends Object
{
	String name;
	String color;
	int cost;
	String breed;
	public dog() {
		// TODO Auto-generated constructor stub
		super();
		name="leo";
		color="brown";
		cost=14000;
		breed="gm";
		} 
	public dog(String name)
	{
		super();
		this.name=name;
	}
	public dog(String name,int cost)
	{
		super();
		this.name=name;
		this.cost=cost;
	}
	public dog(String name,int cost,String color)
	{
		super();
		this.name=name;
		this.cost=cost;
		this.color=color;
	}
	public dog(String name,int cost,String color,String breed)
	{
		super();
		this.name=name;
		this.cost=cost;
		this.color=color;
		this.breed=breed;
	}
	void run()
	{
		System.out.println("run");
	}
	void eat()
	{
		System.out.println("eat");
	}
	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
	
}
public class launchdog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		d.display();
		dog d1=new dog("chris");
		d1.display();
		dog d2=new dog("charly",3400);
		d2.display();
		dog d3=new dog("rexy",8000,"red");
		d3.display();
		dog d4=new dog("tyson",20000,"black","doberman");
		d4.display();

	}

}

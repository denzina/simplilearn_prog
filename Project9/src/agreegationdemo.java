//aggregate object
class heart
{
	int beat;
	String color;
	public heart(int beat,String color)
	{
		//super();
		this.beat=beat;
		this.color=color;
		
	}
	public int getBeat() {
		return beat;
	}
	public String getColor() {
		return color;
	}
	
}
//composite object
class mobile
{
	int cost;
	String Company;
	public mobile(int cost, String company) {
	//	super();
		this.cost = cost;
		Company = company;
	}
	public int getCost() {
		return cost;
	}
	public String getCompany() {
		return Company;
	}
	
}
//main object
class denzina
{
	heart h=new heart(72,"red");
	void hasMobile(mobile m)
	{
		System.out.println(m.getCompany());
		System.out.println(m.getCost());
	}

	
	
}
public class agreegationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		denzina d=new denzina();
		mobile m=new mobile(8000,"samsung");
		System.out.println(d.h.getBeat());
		System.out.println(d.h.getColor());
		d.hasMobile(m);
		d=null;//since the obect doesnot exit
//		System.out.println(d.h.getBeat());//null pointer exception
//		System.out.println(d.h.getColor());
		
		System.out.println(m.getCompany());
		System.out.println(m.getCost());
	}

}

class empinfo
{
	int id;
	String name;
	empinfo()
	{
		id=3;
		name="anto";
		System.out.println(id);
		System.out.println(name);
	}
	empinfo(int a,String b)
	{
		id=a;
		name=b;
		System.out.println(id);
		System.out.println(name);
	}
}

public class constructordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        empinfo e=new empinfo();
        empinfo e1=new empinfo(10,"bharath");
	}

}

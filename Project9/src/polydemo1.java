class polydemo1
{
	public int polydemo1(int x,int y)
	{
		return(x+y);
	}
	public int polydemo1(int x,int y,int z)
	{
		return(x+y+z);
	}
	public double polydemo1(double x,double y)
	{
		return(x+y);
	}
	public double polydemo1(double x,double y,double z)
	{
		return(x+y+z);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polydemo1 p=new polydemo1();
		System.out.println(p.polydemo1(10,20));
		System.out.println(p.polydemo1(10,20,30));
		System.out.println(p.polydemo1(3.5, 7.9));
		System.out.println(p.polydemo1(5.8, 9.7, 4.8));
	}

}

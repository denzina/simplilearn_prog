public class objectdemo 
{
	String name;
	String breed;
	int age;
	String color;
	public objectdemo (String name, String breed, int age, String color) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
	public String toString()
	{
		return("hi my name is" +this.getName()+"\n my breed age and color is:"+this.getBreed()+this.getColor()+this.getAge());
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objectdemo  d=new objectdemo ("leo","gs",20,"black");
		System.out.println(d.toString());

	}

}

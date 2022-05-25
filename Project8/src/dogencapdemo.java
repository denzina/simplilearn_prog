class dog
{
	int age;
	String name;
	String breed;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
}
public class dogencapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		d.setAge(5);
		System.out.println(d.age);
	}

}

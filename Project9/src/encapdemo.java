
 class encap1 {
    private String name;
    private int rolllnum;
    private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRolllnum() {
		return rolllnum;
	}
	public void setRolllnum(int rolllnum) {
		this.rolllnum = rolllnum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
}
public class encapdemo
{
	public static void main(String[] args) {
		encap1 e=new encap1();
		e.setName("bharath");
		e.setAge(35);
		e.setRolllnum(112233);
		System.out.println(e.getName()+" "+e.getAge()+" "+e.getRolllnum());
	}
}
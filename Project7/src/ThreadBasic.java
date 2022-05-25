
public class ThreadBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setPriority(1);
		System.out.println(t.getPriority());
		System.out.println(t.getId());
		System.out.println(t.getClass());
		System.out.println(Thread.currentThread().getName());
		t.setName("bharath");
		System.out.println(t.getName());
	}

}

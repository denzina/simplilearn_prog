
public class callmethod1 {
    int val=150;//instance variable
    int operation(int val)//local variable
    {
    	this.val=(val*10)/100;
    	return val;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       callmethod1 b=new callmethod1();
       System.out.println(b.val);
       b.operation(100);
       System.out.println(b.val);
	}

}


public class callmethod {
    int val=150;//instance variable
    int operation(int val)//local variable
    {
    	val=(val*10)/100;
    	return val;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       callmethod b=new callmethod();
       System.out.println(b.val);
       b.operation(100);
       System.out.println(b.val);
	}

}

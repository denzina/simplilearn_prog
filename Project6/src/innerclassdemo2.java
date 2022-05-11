
public class innerclassdemo2 {
    private String msg="welcome to java";
    void display()
    {
    	class inner
    	{
    		void msg()
    		{
    			System.out.println(msg);
    		}
    	}
    	inner i=new inner();//here the object is created because we have created the class inside the method
    	i.msg();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerclassdemo2 in =new innerclassdemo2 ();
		in.display();
	}

}

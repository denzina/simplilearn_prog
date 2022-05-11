
public class innerclassdemo {
    private String msg="welcome to java";
    class inner
    {
    	void hello()
    	{
    		System.out.println(msg+"lets starts the course");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerclassdemo obj=new innerclassdemo();
		innerclassdemo.inner i=obj.new inner();//object creation
		i.hello();
	}

}

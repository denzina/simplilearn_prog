
public class exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[3];
		try
		{
			arr[7]=3;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("array is sof size"+arr.length);
		}
		
	}

}

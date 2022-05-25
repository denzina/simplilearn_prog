import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner sc =new Scanner(System.in);
		String userid[]=new String[4];
		for(int i=0;i<4;i++)
		{
			System.out.println("enter the mailid"+(i+1));
			userid[i]=sc.next();
			String pattern="ericdenzina@gmail.com";
			String check=userid[i];
			Pattern p=Pattern.compile(pattern);
			Matcher c=p.matcher(check);
			while(c.find())
			{
				System.out.println(check.substring(c.start(), c.end()));
			}
			

		}
				
		
		
	}

}

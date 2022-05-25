import java.util.regex.*;

public class regularexpdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="[abc]+";
		String match="Regul Expression";
		Pattern p=Pattern.compile(pattern);
		Matcher c=p.matcher(match);
		while(c.find())
		{
			System.out.println(match.substring(c.start(), c.end()));
		}
	}

}

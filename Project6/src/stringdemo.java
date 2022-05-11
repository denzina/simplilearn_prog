
public class stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("methods of string");
		String s=new String("hello");
		System.out.println(s.length());
		System.out.println(s.substring(2));
		String s1="hello";
		String s2="heldo";
		System.out.println(s1.compareTo(s2));//whenever there is the mismatch the ascii values with be collected and subtracted
		String s3="";
		System.out.println(s3.isEmpty());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.replace('h', 'H'));
		System.out.println(s1.equals(s3));
		System.out.println("*************************StringBuffer");
		StringBuffer s5=new StringBuffer("welcome to java");
		s5.append("lets strat");
		System.out.println(s5);
		s5.insert(4, "prog");
		System.out.println(s5);
		s5.replace(0, 10, "web programming");
		System.out.println(s5);
		s5.delete(15, 16);
		System.out.println(s5);
		System.out.println("*************************StringBuilder");
		StringBuilder s6=new StringBuilder("welcome to java");
		s6.reverse();
		System.out.println(s6);
		//conversion
		StringBuffer s7=new StringBuffer(s);
		s7.append("world");
		System.out.println(s7);
		StringBuilder s8=new StringBuilder(s);
		s8.reverse();
		System.out.println(s8);
	}

}

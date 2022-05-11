import java.util.*;
public class mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hashmap");
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"bharath");
		hm.put(2, "chris");
		hm.put(3, "leo");
		for(Map.Entry n:hm.entrySet())
		{
			System.out.println(n.getKey()+" "+n.getValue());
		}
		System.out.println("hashtable");
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(1,"bharath");
		ht.put(2, "chris");
		ht.put(3, "leo");
		for(Map.Entry n1:ht.entrySet())
		{
			System.out.println(n1.getKey()+" "+n1.getValue());
		}
		System.out.println("hashtable");
		TreeMap<Integer,String> ts=new TreeMap<Integer,String>();
		ts.put(2,"bharath");
		ts.put(1, "chris");
		ts.put(3, "leo");
		for(Map.Entry n2:ts.entrySet())
		{
			System.out.println(n2.getKey()+" "+n2.getValue());
		}
		System.out.println("hashtable");
		TreeMap<String,String> ts1=new TreeMap<String,String>();
		ts1.put("alex","bharath");
		ts1.put("ram", "chris");
		ts1.put("bob", "leo");
		for(Map.Entry n2:ts1.entrySet())
		{
			System.out.println(n2.getKey()+" "+n2.getValue());
		}
	}

}

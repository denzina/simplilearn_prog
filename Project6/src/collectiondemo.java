import java.util.*;
public class collectiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("arraylist mixed data");
		ArrayList al=new ArrayList();
		al.add("bharath");
		al.add(1200);
		al.add(1234.76f);
		System.out.println(al);
		ArrayList<String> city=new ArrayList<String>();
		city.add("bangalore");
		city.add("delhi");
		System.out.println(city);
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(12345);
		num.add(86794);
		num.add(123);
		System.out.println(num);
		ArrayList<Float> num2=new ArrayList<Float>();
		num2.add(123.67f);
		num2.add(456.89f);
		System.out.println(num2);
		System.out.println("vector");
		Vector vec=new Vector();
		vec.addElement(num2);
		System.out.println(vec);
		vec.addElement(al);
		System.out.println(vec);
		vec.addElement(num);
		System.out.println(vec);
		System.out.println(vec.isEmpty());
		System.out.println(vec.capacity());
		System.out.println(num2.clone());
		System.out.println("******************linked list");
		LinkedList ll=new LinkedList();
		ll.add("chriselle");
		ll.add(123456);
		System.out.println(ll);
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("******************hashset");	
		HashSet hs=new HashSet();
		hs.add("serah");
		hs.add(100);
		hs.add(100.566f);
		System.out.println(hs);
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("******************linkedhashset");	
		LinkedHashSet hs1=new LinkedHashSet();
		hs1.add("serah");
		hs1.add(100);
		hs1.add(100.566f);
		System.out.println(hs);
		Iterator it1=hs.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}

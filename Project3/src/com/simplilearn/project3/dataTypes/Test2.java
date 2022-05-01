package com.simplilearn.project3.dataTypes;
class dog
{
	String name,color,breed;
    int cost,age;
     void eat()
     {
   	  System.out.println("eat");
     }
     void run()
     {
   	  System.out.println("run");
     }
     void bark()
     {
      	  System.out.println("bark");
        }
}
public class Test2 {
	
	public static void main(String[] args) {
	     dog d = new dog();
	     d.eat();
	     d.run();
	     d.bark();
	     d.name="leo";
	     d.cost=17000;
	     d.color="red";
	     d.age=2;
	     d.breed="gr";
	     System.out.println(d.name+""+d.cost+""+d.color+""+d.age+""+d.breed);
	     System.out.println("\n"+"address od d"+d);
	     
	      
	     
	     
		
	}

}

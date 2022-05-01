package com.simplilearn.project5.calculator;
import java.util.*;
class Test
{
	void operations()
	 {
		 
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the number1:");
	     int num1=sc.nextInt();
	     System.out.println("Enter the number 2:");
	     int num2=sc.nextInt();
	     System.out.println("enter the oprator");
	     char choice=sc.next().charAt(0);
	     switch(choice)
	     {
	     case '+':int res=num1+num2;
	     		  System.out.println(res);
	     		  break;
	     case '-':int res1=num1-num2;
		  		  System.out.println(res1);
		  		  break;
		 case '*':int res2=num1*num2;
		 		  System.out.println(res2);
			      break;
		 case '/':float res3=num1/num2;
		  		  System.out.println(res3);
		  		  break;
		 case '%':float res4=num1/num2;
			  	  System.out.println(res4);
			      break;
		 default:System.out.println("Select a proper operator");
		 		 System.exit(0);
		         break;
	     }
	 }
}
public class calculator {
 
	public static void main(String[] args) {
		Test t=new Test();
		for(;;)
		{
			t.operations();
		}
				
    
     }
	}



import java.util.*;
public class arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//static approach
		int a[]= {10,20,30,40,50};
		for(int i =0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		//dynamic approach
		
		System.out.println("enter the size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("enter the elements");
		int a1[]=new int[size];
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("enetr the elemnte no:"+(i+1));
			a1[i]=sc.nextInt();
			
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("the elemnts no "+(i+1)+":"+a1[i]);
			
		}
		//2d static approach
		int b[][]={ { 10,20,30},
				     {40,50,60},
				     {70,80,90}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		
				
		}
		int k[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				k[i][j]=sc.nextInt();
				
			}


		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				System.out.print(k[i][j]+" ");
			}
			System.out.println();
		}
	}

}

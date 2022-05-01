package com.simplilearn.project2.datatypes;

public class dataTypes {

	public static void main(String[] args) {
		byte a=10;
		short s =20;
		int i1=500;
		long u=45766l;
		float f=7.4f;
		double d = 6.8;
		System.out.println(a+"\n"+s+"\n"+i1+"\n"+u+"\n"+f+"\n "+d);
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(count);
				System.out.print(" ");
				count++;
			}
			System.out.println();
		}
		int count1=25;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(count1);
				
				System.out.print(" ");
				count1--;
			}
			System.out.println();
		}
		int count2=25;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(count2<10)
				{
				System.out.print("0");
				System.out.print(count2);
				System.out.print(" ");
				count2--;
				}
				else
				{
				System.out.print(count2);
				System.out.print(" ");
				count2--;
				}
			}
			System.out.println();
		}
		int count3=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count3);
				
				System.out.print(" ");
				count3++;
			}
			System.out.println();
		}
		int count4=1;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count4);
				
				System.out.print(" ");
				count4++;
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("$");
				System.out.print(" ");
			}
			for(int k=1;k<=5;k++)
			{
				System.out.print("#");
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("$");
				System.out.print(" ");
			}
			for(int k=1;k<=5;k++)
			{
				System.out.print("#");
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
				System.out.print("#");
				System.out.print(" ");
				}
				else
				{
					System.out.print(" ");
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i%2!=0)
				{
				System.out.print("1");
				System.out.print(" ");
				}
				else
				{
					System.out.print("0");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j%2!=0)
				{
				System.out.print("1");
				System.out.print(" ");
				}
				else
				{
					System.out.print("0");
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

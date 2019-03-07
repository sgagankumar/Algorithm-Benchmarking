// LINEAR SEARCH ALGORITHM

import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String args[])
	{
		System.out.println("-----LINEAR SEARCH-----\n\n");
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched:");
		int f=sc.nextInt();
		linearsearch(a,n,f);
		sc.close();
	}
	public static void linearsearch(int a[],int n,int f)
	{
		//a is the array having the search elements
		//n is the number of elements in a
		//f is the number to be searched
		boolean p=true;
		for(int i=0;i<n;i++)
		{
			if(a[i]==f)
			{
				System.out.println("Element found in location "+(i+1));
				p=false;
				break;
			}
		}
		if(p)
		{
			System.out.println("Element not found!!!");
		}
	}
}

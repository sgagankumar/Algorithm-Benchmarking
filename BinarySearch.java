package sortingAlgorithms;

import java.util.Scanner;

public class BinarySearch 
{
	public static void main(String args[])
	{
		System.out.println("----BINARY SEARCH----\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched:");
		int f=sc.nextInt();
		binarysearch(a,n,f);
		sc.close();
	}
	public static void binarysearch(int a[],int n,int f)
	{
		//a is the array having the search elements
		//n is the number of elements in a
		//f is the number to be searched
		boolean p=true;
		sort(a,n);
		int low=0,high=n-1,mid=0;
		while(low<=high)
		{
			mid=((low+high)/2);
			if(a[mid]==f)
			{
				System.out.println("Element found at location "+(mid+1));
				p=false;
				break;
			}
			else if(a[mid]>f)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		if(p)
		{
			System.out.println("Element not found!!!");
		}
	}
	public static void sort(int a[], int n)
	{
		//TODO:: sort algorithm
		
		
	}
}

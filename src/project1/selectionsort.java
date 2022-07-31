package project1;

public class selectionsort {
	public static void sort(int arr[])
	{int temp;
		for(int i=0;i<arr.length;i++)
		{
			for( int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String args[])
	{
int arr[]= {12,42,56,6,78};
sort(arr);
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]+"  ");
}
}
}
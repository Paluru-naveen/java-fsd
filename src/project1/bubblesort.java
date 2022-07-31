package project1;
public class bubblesort {
	public static void sort(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
		int arr[]= {23,12,45,34,23,76,98};
		sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	}
	
}



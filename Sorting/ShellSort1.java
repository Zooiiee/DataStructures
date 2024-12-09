/*
	Name: Zoya Jetham
	Roll Number: 1520
	Unit 1: Sorting & Searching Techniques
	Program: Shell Sort */ 
          
import java.util.Scanner;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               class ShellSort1
{
	//Method for ShellSort
	public static void SSort(int[] arr)
	{
		int n =  arr.length;
		int temp;
		
		//Start with Increment n/2
		for(int gap=n/2 ; gap>0 ; gap=gap/2)	// Reduce gap size
		{
			for(int i=gap ; i<n ;i++)	// Perform insertion sort for elements at a gap

			{
				//save the current element
				temp=arr[i];
				int j;
					
				//Shift gap Sorted elements
				for(j=i; j>=gap && arr[j-gap]>temp ; j=j-gap)
				{
					arr[j] = arr[j-gap];

				}//end of for j
				
				//Put temp in its correct position
				arr[j]=temp;

			}//end of inner for i
		}//end of for gap
	}//end of SSort
	
	//Display
	public static void Display(int[] arr)
	{
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
	}//end of Display

	//main
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        	// Input the size of the array
        	System.out.println("*** Shell Sort ***\n");
        	System.out.print("Enter the size of the array: ");
        	int n = scanner.nextInt();

        	// Input the array elements
        	int[] arr = new int[n];
        	System.out.println("Enter the array elements:");
        	for (int i = 0; i < n; i++) 
		{
            		arr[i] = scanner.nextInt();
        	}

		System.out.print("\nOriginal Array : ");
		Display(arr);
		SSort(arr);
		System.out.print("\n\nSorted Array : ");
		Display(arr);
	}

}//end of shellsort              

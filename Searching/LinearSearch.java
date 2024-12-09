import java.util.Scanner;

public class LinearSearch {

    	// Method to perform linear search
    	public static int linearSearch(int[] arr, int n, int key) 
	{
        	for (int i = 0; i < n; i++) 
		{
            		if (arr[i] == key) 
			{
                		return i; // Return the index if the key is found
            		}
        	}
        	return -1; // Return -1 if the key is not found
    	}//end of Line

    	// Method to display the array elements
    	public static void displayArray(int[] arr, int n) 
	{
                for (int i = 0; i < n; i++) 
		{
            		System.out.print(arr[i] + " ");
        	}
        	System.out.println();
    	}//end of DisplayArray

    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);

        	System.out.println("*** Linear Search ***\n");

        	System.out.print("Enter the number of elements in the Array: ");
        	int n = sc.nextInt();

        	int[] arr = new int[n];

        	System.out.println("Enter Array Elements:");
        	for (int i = 0; i < n; i++) 
		{
            		arr[i] = sc.nextInt();
        	}

		System.out.print("The Array :");
		displayArray(arr, n);

        	System.out.print("\nEnter the Key Value: ");
        	int key = sc.nextInt();

                int result = linearSearch(arr, n, key);

        	if (result != -1) 
		{
            		System.out.println("\nThe Key is found at index: " + result);
        	} 
		else 
		{
            		System.out.println("\nThe Key is Not Found");
        	}
    	}//end of main
}//end of LinearSearch

import java.util.Scanner;

public class BinarySearch 
{

    	// Method to perform binary search
    	public static int binarySearch(int[] arr, int n, int key) 
	{
        	int first = 0;
        	int last = n - 1;

        	while (first <= last) 
		{
            		int mid = (first + last) / 2;

            		if (arr[mid] == key) 
			{
                		return mid; // Return the index if the key is found
            		} 
			else if (key < arr[mid]) 
			{
                		last = mid - 1; // Adjust the last pointer
            		} 
			else 
			{
                		first = mid + 1; // Adjust the first pointer
            		}
        	}
        	return -1; // Return -1 if the key is not found
    	}

    	// Method to display the array
    	public static void displayArray(int[] arr, int n) 
	{
        	System.out.print("Array: ");
        	for (int i = 0; i < n; i++) 
		{
            		System.out.print(arr[i] + " ");
        	}
        	System.out.println();
    	}//End of displayArray

	//main
    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);

        	System.out.println("*** Binary Search ***\n");

        	System.out.print("Enter the Size of the Array: ");
        	int n = sc.nextInt();

        	int[] arr = new int[n];

        	System.out.println("Enter the Array Elements in Ascending Order:");
        	for (int i = 0; i < n; i++) 
		{
            		arr[i] = sc.nextInt();
        	}

        	displayArray(arr, n);

        	System.out.print("\nEnter the Key Value: ");
        	int key = sc.nextInt();

                int result = binarySearch(arr, n, key);

        	if (result != -1) {
            		System.out.println("\nThe Key is found at index: " + result);
        	} else {
            		System.out.println("\nKey is Not Found");
        	}
    	}//end of main
}//end of 

import java.util.Scanner;

public class SelectionSort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the array
        int[] arr = new int[10];
        int n;
        
        // Input the size of the array
        System.out.println("*** Selection Sort ***\n");
        System.out.print("Enter the size of the array: ");
        n = scanner.nextInt();
        
        // Input the array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Display the array before sorting
        System.out.print("\nArray Before Sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Selection Sort
        for (int j = 0; j < n - 1; j++) {
            // Assume the first element of unsorted region is minimum
            int min = arr[j];
            int loc = j;
            
            // Find the minimum element in the unsorted region
            for (int i = j + 1; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i]; // Update minimum value
                    loc = i; // Update its location
                }
            }
            
            // Swap min element with the first element of the unsorted region
            int temp = arr[j];
            arr[j] = arr[loc];
            arr[loc] = temp;
        }
        
        // Display the array after sorting
        System.out.print("\nArray After Sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        scanner.close();
    }
}

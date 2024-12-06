import java.util.Scanner;

public class InsertionSort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the array
        int[] arr = new int[10];
        int n;
        
        // Input the size of the array
        System.out.println("*** Insertion Sort ***\n");
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
        
        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int pos = i - 1; // Element at the start of the unsorted array
            
            while (pos >= 0 && temp < arr[pos]) {
                arr[pos + 1] = arr[pos];
                pos--;
            }
            arr[pos + 1] = temp;
        }
        
        // Display the sorted array
        System.out.print("\nSorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        scanner.close();
    }
}

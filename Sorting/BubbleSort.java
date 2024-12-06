import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Bubble Sort***\n");

        // Input the array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display the array before sorting
        System.out.print("\nArray Before Sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) { // Only check unsorted part
                if (arr[i] > arr[j]) {
                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Display the array after sorting
        System.out.print("\nArray After Sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}

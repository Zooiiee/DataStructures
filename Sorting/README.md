## Sorting Algorithms

This folder contains implementations of various sorting algorithms. Sorting is a fundamental operation in computer science that arranges elements of a list in a specified order (usually in ascending or descending order). Each algorithm has its unique approach and time complexity, making them suitable for different use cases. Below is a brief description of the included sorting algorithms:

1. **Bubble Sort**: A simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. It's intuitive but inefficient for large datasets with a time complexity of \(O(n^2)\).

2. **Selection Sort**: An in-place comparison algorithm that repeatedly selects the smallest (or largest) element from the unsorted part and swaps it with the first unsorted element. It also has a time complexity of \(O(n^2)\).

3. **Insertion Sort**: A simple sorting algorithm that builds the final sorted array one element at a time by inserting each element into its correct position within the sorted part. Like Bubble and Selection Sort, it also has a worst-case time complexity of \(O(n^2)\).

4. **Shell Sort**: An improved version of Insertion Sort that compares elements at a specific gap and reduces the gap over time. It has better performance than Insertion Sort and can achieve time complexities between \(O(n)\) and \(O(n^2)\) depending on the gap sequence used.

5. **Merge Sort**: A divide-and-conquer algorithm that divides the array into two halves, recursively sorts them, and merges the sorted halves. It guarantees \(O(n \log n)\) time complexity and is often used for large datasets.

6. **Quick Sort**: Another divide-and-conquer algorithm that selects a pivot element, partitions the array into smaller elements (less than the pivot) and larger elements (greater than the pivot), and recursively sorts them. With a best and average-case time complexity of \(O(n \log n)\), it's one of the most efficient algorithms for sorting.

7. **Heap Sort**: A comparison-based algorithm that uses a binary heap data structure to sort elements. It first builds a heap from the input data and then sorts it. Its time complexity is \(O(n \log n)\), and it does not require additional space like Merge Sort.

8. **Radix Sort**: A non-comparative sorting algorithm that sorts numbers digit by digit, starting from the least significant digit. It is suitable for sorting integers or strings and has a time complexity of \(O(nk)\), where \(n\) is the number of elements and \(k\) is the number of digits.

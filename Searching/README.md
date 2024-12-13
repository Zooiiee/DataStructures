# Searching Algorithms

This folder contains implementations of two fundamental searching algorithms: **Linear Search** and **Binary Search**. Both are essential for efficiently locating elements in datasets, and their application depends on the nature of the data being searched.

---

## **1. Linear Search**
Linear Search is a simple algorithm that traverses through each element in the dataset until the desired element is found or the search ends. It works on both sorted and unsorted datasets.

### **Algorithm Steps:**
1. Start from the first element of the array.
2. Compare each element with the target value.
3. If the target is found, return its position.
4. If the end of the array is reached and the target is not found, return "not found."

### **Features:**
- Works on **unsorted data**.
- Has a time complexity of **O(n)** in the worst case.

### **Example Use Case:**
- Searching for a specific book title in an unsorted list of books.

---

## **2. Binary Search**
Binary Search is a more efficient algorithm that works on sorted datasets by repeatedly dividing the search interval in half.

### **Algorithm Steps:**
1. Check if the target value is equal to the middle element.
2. If the target is smaller than the middle element, search in the left half.
3. If the target is larger, search in the right half.
4. Repeat until the target is found or the interval is empty.

### **Features:**
- Requires the dataset to be **sorted**.
- Has a time complexity of **O(log n)** in the worst case.

### **Example Use Case:**
- Searching for a specific number in a sorted list of student IDs.

---

## **Code Files in This Folder**
1. **LinearSearch.java**  
   - Implementation of the linear search algorithm.
   - Suitable for small or unsorted datasets.

2. **BinarySearch.java**  
   - Implementation of the binary search algorithm.
   - Designed for large, sorted datasets.

---

## **How to Run**
1. Clone the repository to your local system.
2. Navigate to the folder containing the desired search algorithm.
3. Compile the Java file using:
   ```bash
   javac LinearSearch.java
   javac BinarySearch.java
   ```
4. Run the program using:
   ```bash
   java LinearSearch
   java BinarySearch
   ```

---

## **Visual Representation**
### Linear Search:
- Traverses the array element by element.  
 ![image](https://github.com/user-attachments/assets/dad1c39b-60dc-44d9-be95-fad6435ba955)


### Binary Search:
- Recursively splits the dataset into halves.  
[![Animated GIF](https://devopedia.org/images/article/28/2951.1490520804.gif)](https://devopedia.org/images/article/28/2951.1490520804.gif)


---

## **Conclusion**
Both algorithms serve distinct purposes depending on the dataset's structure. Linear Search is versatile and simple, while Binary Search provides efficiency for sorted data.

# Hashing with Linear Probing

This repository contains two implementations of hashing with linear probing for collision resolution, demonstrating different hash functions:

## 1. Digit Extraction Hashing

### Description:
In the **Digit Extraction Hashing** approach, the hash function extracts the last digit of the key. This is particularly simple and useful when the data values are such that the last digit carries significant distribution potential. Collision handling is implemented using linear probing.

### Features:
- **Hash Function:** Extracts the last digit of the key (`key % 10`).
- **Collision Handling:** Linear probing ensures that collisions are resolved by checking subsequent indices cyclically.
- **Display:** Displays the entire hash table, showing the keys stored at each index.
- **Capacity:** Fixed size specified during initialization.

### Example:
```java
int[] keys = {341, 345, 461, 567, 231, 316};
```
For a table with capacity 10:
```
Index 0: null
Index 1: 341
Index 2: 231
Index 3: 316
Index 4: 345
Index 5: null
Index 6: 567
Index 7: null
Index 8: null
Index 9: 461
```

---

## 2. Modulo Division Hashing

### Description:
In the **Modulo Division Hashing** approach, the hash function computes the remainder of the division of the key by the table capacity. This method provides a good distribution when the table size is a prime number or unrelated to the dataset distribution. Linear probing is used to resolve collisions.

### Features:
- **Hash Function:** Computes the hash using modulo division (`key % capacity`).
- **Collision Handling:** Linear probing ensures collision resolution by searching for the next available slot.
- **Display:** Outputs the hash table with indices and stored keys.
- **Capacity:** Fixed size determined during initialization.

### Example:
```java
int[] keys = {5, 34, 12, 9, 54, 1};
```
For a table with capacity 10:
```
Index 0: null
Index 1: 1
Index 2: 12
Index 3: null
Index 4: null
Index 5: 5
Index 6: null
Index 7: null
Index 8: 54
Index 9: 9
```

---

## Key Concepts:
- **Hash Function:** Determines the index for storing keys in the hash table.
- **Collision Handling:** Resolves conflicts when multiple keys hash to the same index using linear probing.
- **Efficiency:** Both methods ensure efficient insertion, deletion, and search operations under a reasonable load factor.

---

## Running the Code:
1. Clone the repository.
2. Compile the Java files using `javac`.
3. Run the main classes (`HashTable1` for digit extraction, `HashTable` for modulo division) using `java`.

---

## Example Output:
**Digit Extraction Hashing:**
```
Hash Table:
Index 0: null
Index 1: 341
Index 2: 231
...
```
**Modulo Division Hashing:**
```
Hash Table:
Index 0: null
Index 1: 1
Index 2: 12
...
```


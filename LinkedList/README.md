# Linked List Implementations

This repository contains implementations of **Singly Linked List**, **Circular Linked List**, and **Doubly Linked List**. Each type of linked list supports common operations such as **insertion at head/tail**, **counting elements**, **displaying the list**, **deletion**, and **searching for elements**.

## Table of Contents

1. [Singly Linked List](#1-singly-linked-list)
2. [Circular Linked List](#2-circular-linked-list)
3. [Doubly Linked List](#3-doubly-linked-list)
4. [Operations Overview](#operations-overview)

---

### **1. Singly Linked List**

A **Singly Linked List** is a linear data structure where each element (node) contains a value and a reference (or link) to the next node in the sequence. This structure allows for efficient insertion and deletion of nodes.

![Singly Linked List](https://github.com/user-attachments/assets/f563420d-3c40-4ee5-a475-9fcb9f1e1236)

**Operations:**

- **Insert at Tail**: Adds a new node at the end of the list.
- **Insert at Head**: Adds a new node at the beginning of the list.
- **Count**: Returns the total number of nodes in the list.
- **Display**: Traverses and prints all nodes in the list.
- **Delete**: Removes a node from the list based on its value or position.
- **Search**: Finds a node in the list by its value.

---

### **2. Circular Linked List**

A **Circular Linked List** is similar to a singly linked list but with one key difference: the last node points back to the first node, creating a circular structure. This allows for continuous traversal of the list without hitting a null reference.

![Circular Linked List](https://github.com/user-attachments/assets/f0e5ee23-e201-4879-9d25-597ac696c330)

**Operations:**

- **Insert at Tail**: Adds a new node at the end of the circular list, adjusting pointers accordingly.
- **Insert at Head**: Adds a new node at the beginning, updating links to maintain circularity.
- **Count**: Counts all nodes in the circular structure, ensuring not to loop infinitely.
- **Display**: Prints all nodes starting from a given point, looping back to the start.
- **Delete**: Removes a specified node while maintaining circular integrity.
- **Search**: Searches for a node by its value, handling circular traversal.

---

### **3. Doubly Linked List**

A **Doubly Linked List** consists of nodes that contain references to both the next and previous nodes. This bi-directional linking allows for more flexible navigation and manipulation of nodes.

![Doubly Linked List](https://github.com/user-attachments/assets/774b7176-0e01-44b2-9131-de2804d077a9)

**Operations:**

- **Insert at Tail**: Appends a new node at the end, adjusting both forward and backward links.
- **Insert at Head**: Prepends a new node at the beginning, updating links in both directions.
- **Count**: Counts all nodes in the list by traversing from either end.
- **Display**: Prints all nodes from head to tail and optionally from tail to head.
- **Delete**: Removes a specified node while properly re-linking adjacent nodes.
- **Search**: Searches for a node by its value, traversing in both directions.

---

## Operations Overview

Each type of linked list supports the following common operations:

### 1. **Insert at Head**
- Adds a new node at the beginning of the list.
- **Time complexity**: **O(1)**.

### 2. **Insert at Tail**
- Adds a new node at the end of the list.
- **Time complexity**: **O(n)** for Singly and Circular Linked Lists. **O(1)** for Doubly Linked List (if a tail pointer is maintained).

### 3. **Count**
- Returns the number of nodes in the list.
- **Time complexity**: **O(n)**.

### 4. **Display**
- Traverses the entire list and prints each node's data.
- **Time complexity**: **O(n)**.

### 5. **Delete**
- Removes a node from the list. The node to be deleted can be at the head, tail, or any position.
- **Time complexity**: **O(1)** if deleting from head, **O(n)** if deleting from a specific position.

### 6. **Search**
- Searches for an element in the list.
- **Time complexity**: **O(n)**.


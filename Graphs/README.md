# Graph Algorithms

Welcome to the **Graphs Folder** in this repository! This folder contains Java implementations for common graph representations and traversal algorithms. Below is a structured description of each implementation to help you understand and utilize the code effectively.

---

## 1. Adjacency Matrix Representation
### **Description**
The adjacency matrix is a 2D array representation of a graph where each cell \( mat[i][j] \) indicates whether there is an edge between vertex \( i \) and vertex \( j \). This is a simple and efficient way to represent dense graphs.

### **Features**
- **Input:** Number of vertices and edges.
- **Edge Representation:** Reads edges as pairs of source and destination.
- **Output:** A matrix representation of the graph.

### **Highlights**
- Allows undirected graph representation.
- Demonstrates clear input/output of adjacency matrix.

### **Usage**
Run the program, input the number of vertices and edges, and provide the edges to generate the adjacency matrix.

---

## 2. Breadth-First Traversal (BFT)
### **Description**
Breadth-First Traversal is an algorithm used to explore all vertices of a graph in breadthwise fashion, starting from a given vertex. The implementation uses an adjacency matrix and a queue to handle graph traversal.

### **Features**
- **Graph Representation:** Undirected graph using an adjacency matrix.
- **Traversal:** Visits vertices level by level.
- **Queue Operations:** Implements enqueue and dequeue for traversal management.

### **Highlights**
- Demonstrates efficient traversal of graphs.
- Explains collision handling and visited tracking.
- Outputs the traversal sequence of nodes.

### **Usage**
Define a graph by adding edges and call the `performBFT` method with the starting vertex.

---

## 3. Depth-First Traversal (DFT)
### **Description**
Depth-First Traversal explores as far as possible along each branch before backtracking. This implementation uses an adjacency matrix and a stack to perform the traversal.

### **Features**
- **Graph Representation:** Undirected graph using an adjacency matrix.
- **Traversal:** Visits vertices in depthwise fashion.
- **Stack Operations:** Implements push and pop for traversal management.

### **Highlights**
- Efficient exploration of graphs.
- Demonstrates backtracking and unvisited node management.
- Outputs the traversal sequence of nodes.

### **Usage**
Define a graph by adding edges and call the `performDFT` method with the starting vertex.

---

## How to Use These Codes
1. **Setup:** Clone this repository and navigate to the `Graphs` folder.
2. **Run Programs:** Compile and execute the Java programs with a Java compiler.
3. **Modify:** Edit the code to experiment with different graph inputs and traversal starting points.

## Code Highlights
- **Adjacency Matrix:** Basic graph representation for understanding connectivity.
- **Breadth-First Traversal:** Ideal for shortest path and connectivity checks.
- **Depth-First Traversal:** Useful for connectivity and topological sorting in directed acyclic graphs.


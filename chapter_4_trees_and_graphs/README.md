
## Binary Tree
Binary tree is a tree which each node has up to two children.

### Binary Tree Traversal
 * In-Order Traversal: Left Root Right 
 * Pre-Order Traversal: Root Left Right
 * Post-Order Traversal: Left Right Root
 
### Complete Binary Trees
Every level of the tree is fully filled **except for the perhaps the last level**. In the last level, nodes might or might not be filled fully. Also, let’s note that **all the nodes should be filled from the left**.
### Full Binary Tree
A full binary tree is a binary tree in which every **node has eihter zero or two children**.
### Perfect Binary Trees
A perfect binary tress is one that is **both full and complete**.

![binary tree types](https://github.com/Mfarzana/cracking_the_coding_interview/blob/main/images/binarytrees.png)

### Depth First Search (DFS)
**DFS is often preferred if we want to visit every node** in the tree or graph. DFS has three variants
* Pre-Order Traversal
* In-Order Traversal
* Post-Order Traversal
### Breadth First Search (BFS)
**BFS is better for find shortest path or any path**. BFS has one variant
* Level Order Traversal

![BFS DFS](https://github.com/Mfarzana/cracking_the_coding_interview/blob/main/images/BFS-and-DFS.jpg)

### Minimal Tree
**Convert sorted array to binary search tree with minimal height**
* Insert Middle element as the root
* Insert left subarray as left subtree
* Insert right subarray as right subtree
### Check Balanced
Check Balanced tree is defined to be a tree such that the **heighs** of the **two subtrees of any node never differ by more than one**. 

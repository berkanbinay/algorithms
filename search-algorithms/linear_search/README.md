# Linear Search

Linear Search is defined as a sequential search algorithm that starts at one end and goes through each element of a list until the desired element is found, otherwise the search continues till the end of the data set. It is the easiest searching algorithm

<br>

![Linear Search Illustration](images/linear-search.png)

## How Does It Work ?
---
Iterate from 0 to N-1 and compare the value of every index with x if they match return index

Follow the given steps to solve the problem:

* Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
* If x matches with an element, return the index.
* If x doesn’t match with any of the elements, return -1.

---

**Linear Search Recursive Approach:**

Follow the given steps to solve the problem:

* If the size of the array is zero then, return -1, representing that the element is not found. This can also be treated as the base condition of a recursion call.
* Otherwise, check if the element at the current index in the array is equal to the key or not i.e, arr[size – 1] == key
* If equal, then return the index of the found key.

---

For Iterative Method: 
* **Time Complexity:** O(N)
* **Auxiliary Space:** O(1)

For Recursive Method: 

* **Time Complexity:** O(N)
* **Auxiliary Space:** O(1)
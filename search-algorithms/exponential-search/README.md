# Exponential Search

The name of this searching algorithm may be misleading as it works in O(Log n) time. The name comes from the way it searches an element.
<br>

Given a sorted array, and an element x to be 
searched, find position of x in the array.

## How Does It Work?
---
<br>

Exponential search involves two steps:  

1. Find range where element is present
2. Do Binary Search in above found range.

<br>

**How to find the range where element may be present?**
<br>

The idea is to start with subarray size 1, compare its last element with x, then try size 2, then 4 and so on until last element of a subarray is not greater. 
<br>
Once we find an index i (after repeated doubling of i), we know that the element must be present between i/2 and i (Why i/2? because we could not find a greater value in previous iteration)

<br>

---
<br>

**Time Complexity:** O(Log n)
<br>
**Auxiliary Space:** The above implementation of Binary Search is recursive and requires O(Log n) space. With iterative Binary Search, we need only O(1) space.

<br>

---
<br>

**Applications of Exponential Search:**

1. Exponential Binary Search is particularly useful for unbounded searches, where size of array is infinite. Please refer <u>Unbounded Binary Search</u> for an example.
<br>
2. It works better than Binary Search for bounded arrays, and also when the element to be searched is closer to the first element.
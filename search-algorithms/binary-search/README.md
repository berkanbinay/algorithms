# Binary Search

Given a sorted array arr[] of n elements, write a function to search a given element x in arr[] and return the index of x in the array.
<br><br>
**Linear Search Approach:** A simple 
approach is to do a linear search. The time complexity of the Linear search is O(n). Another approach to perform the same task is using Binary Search.
<br>

**Binary Search** is a searching algorithm used in a sorted array by **repeatedly dividing the search interval in half**. The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n). 

<br>

## How Does It Work ?
---

**Binary Search Algorithm:** The basic steps to perform Binary Search are:

* Begin with the mid element of the whole array as a search key.
* If the value of the search key is equal to the item then return an index of the search key.
* Or if the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
* Otherwise, narrow it to the upper half.
* Repeatedly check from the second point until the value is found or the interval is empty.

---
<br>

>Binary Search Algorithm can be implemented in the following two ways


1. Iterative Method
2. Recursive Method
---
<br>

1. Iteration Method
```
    binarySearch(arr, x, low, high)
        repeat till low = high
               mid = (low + high)/2
                   if (x == arr[mid])
                   return mid
   
                   else if (x > arr[mid]) // x is on the right side
                       low = mid + 1
   
                   else                  // x is on the left side
                       high = mid - 1
```
<br>
2. Recursive Method (The recursive method follows the divide and conquers approach)

<br>

```
binarySearch(arr, x, low, high)
           if low > high
               return False 
   
           else
               mid = (low + high) / 2 
                   if x == arr[mid]
                   return mid
       
               else if x > arr[mid]        // x is on the right side
                   return binarySearch(arr, x, mid + 1, high)
               
               else                        // x is on the right side
                   return binarySearch(arr, x, low, mid - 1) 
```
<br>

**Illustration of Binary Search Algorithm:**

![Illustration](images/binarySearch.png)

--- 
<br>

**Step-by-step Binary Search Algorithm:** We basically ignore half of the elements just after one comparison.

1. Compare x with the middle element.
2. If x matches with the middle element, we return the mid index.
3. Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. So we recur for the right half.
4. Else (x is smaller) recur for the left half.

--- 
<br>

For Iterative Method:
* **Time Complexity:** O(log n)
* **Auxiliary Space:** O(1)

For Recursive Method: 

* **Time Complexity:** O(log n)
* **Auxiliary Space:** O(log n)

Algorithmic Paradigm: <u>**Divide and Conquer.**</u>
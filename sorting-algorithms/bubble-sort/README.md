# Bubble Sort

Bubble Sort is the simplest <u>sorting algorithm</u> that works by repeatedly swapping the adjacent elements if they are in the wrong order. This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.

<br>

## How Does Bubble Sort Work?
---

<br>

<pre>
<b>Input:</b> arr[] = {5, 1, 4, 2, 8}


<b>First Pass:</b>

<li>Bubble sort starts with very first two elements, comparing them to check which one is greater.
<ul>
    <li>( <b>5 1</b> 4 2 8 ) –> ( <b>1 5</b> 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1. 
    <li>( 1 <b>5 4</b> 2 8 ) –>  ( 1 <b>4 5</b> 2 8 ), Swap since 5 > 4 
    <li>( 1 4 <b>5 2</b> 8 ) –>  ( 1 4 <b>2 5</b> 8 ), Swap since 5 > 2 
    <li>( 1 4 2 <b>5 8</b> ) –> ( 1 4 2 <b>5 8</b> ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
</ul>

<b>Second Pass: </b>

<li>Now, during second iteration it should look like this:
<ul>
    <li>( <b>1 4</b> 2 5 8 ) –> ( <b>1 4</b> 2 5 8 ) 
    <li>( 1 <b>4 2</b> 5 8 ) –> ( 1 <b>2 4</b> 5 8 ), Swap since 4 > 2 
    <li>( 1 2 <b>4 5</b> 8 ) –> ( 1 2 <b>4 5</b> 8 ) 
    <li>( 1 2 4 <b>5 8</b> ) –>  ( 1 2 4 <b>5 8</b> ) 
</ul>

<b>Third Pass:</b>

<li>Now, the array is already sorted, but our algorithm does not know if it is completed.
<li>The algorithm needs one whole pass without any swap to know it is sorted.
<ul>
    <li>( <b>1 2</b> 4 5 8 ) –> ( <b>1 2</b> 4 5 8 ) 
    <li>( 1 <b>2 4</b> 5 8 ) –> ( 1 <b>2 4</b> 5 8 ) 
    <li>( 1 2 <b>4 5</b> 8 ) –> ( 1 2 <b>4 5</b> 8 ) 
    <li>( 1 2 4 <b>5 8</b> ) –> ( 1 2 4 <b>5 8</b> )
</ul>

<b>Illustration:</b>

<center>
    <img src='images/bubble-sort-illustration.png' alt='Bubble Sort Illustration'>
</center>
</pre>

<br>

---

<br>

**Follow the below steps to solve the problem:**

* Run a nested for loop to traverse the input array using two variables i and j, such that 0 ≤ i < n-1 and 0 ≤ j < n-i-1
* If arr[j] is greater than arr[j+1] then swap these adjacent elements, else move on
* Print the sorted array

<br>

---

<br>

**Recursive Implementation Of Bubble Sort:**

```
The idea is to place the largest element in its position and keep doing the same for every other element.
```

**Follow the below steps to solve the problem:**

* Place the largest element at its position, this operation makes sure that the first largest element will be placed at the end of the array.
* Recursively call for rest n – 1 elements with the same operation and place the next greater element at their position.
* The base condition for this recursion call would be, when the number of elements in the array becomes 0 or 1 then, simply return (as they are already sorted).

<br>

---


**Is the Bubble sort algorithm stable?**


>Yes, the bubble sort algorithm is stable.

---

<br>

**Where is the Bubble sort algorithm used?**

Due to its simplicity, bubble sort is often used to introduce the concept of a sorting algorithm. <br>
In computer graphics, it is popular for its capability to detect a tiny error (like a swap of just two elements) in almost-sorted arrays and fix it with just linear <br>
complexity (2n). 

<br>

---

<br>

**Advantages of Bubble Sort in Java**

The advantages of bubble sort are:

* It is simple to write and easy to understand
* It takes only a few lines of code
* Bubble sort is an in-place sorting technique, therefore the data is in the memory, and therefore there is minimal memory overhead.

<br>

**Disadvantages of Java Bubble Sort**

There are also some drawbacks of bubble sort which are:

* It takes more amount of time to sort the array elements.
* The average time complexity increases with the increase in the number of elements of the array.

<br>

---

<br>

* **Time Complexity:** O(N<sup>2</sup>)
* **Auxiliary Space:** O(1)
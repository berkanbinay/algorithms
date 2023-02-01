# Insertion Sort

<b>Insertion sort</b> is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.

**<u>Characteristics of Insertion Sort:</u>**
* This algorithm is one of the simplest algorithm with simple implementation
* Basically, Insertion sort is efficient for small data values
* Insertion sort is adaptive in nature, i.e. it is appropriate for data sets which are already partially sorted.

<br>
<br>

## How does Insertion Sort Work?

<br>

<i>
<pre>
Consider an example: arr[]: {12, 11, 13, 5, 6}


<pre>   12      11      13      5       6 </pre>

**First Pass:**

* Initially, the first two elements of the array are compared in insertion sort.

<pre>   <b>12</b>  <b>11</b>  13  5   6   </pre>

* Here, 12 is greater than 11 hence they are not in the ascending order and 12 is not at its correct position. Thus, swap 11 and 12.
* So, for now 11 is stored in a sorted sub-array.

<pre>   <b>11</b>    <b>12</b>   13   5    6    </pre>

**Second Pass:**

* Now, move to the next two elements and compare them

<pre>   11   <b>12</b>   <b>13</b>   5    6    </pre>

* Here, 13 is greater than 12, thus both elements seems to be in ascending order, hence, no swapping will occur. 12 also stored in a sorted sub-array along with 11

**Third Pass:**

* Now, two elements are present in the sorted sub-array which are 11 and 12
* Moving forward to the next two elements which are 13 and 5

<pre>   11   12   <b>13</b>   <b>5</b>    6    </pre>

* Both 5 and 13 are not present at their correct place so swap them

<pre>   11  12  <b>5</b>   <b>13</b>  6   </pre>

* After swapping, elements 12 and 5 are not sorted, thus swap again

<pre>   11  <b>5</b>   <b>12</b>  13  6   </pre>

* Here, again 11 and 5 are not sorted, hence swap again

<pre>   <b>5</b> <b>11</b>   12   13   6    </pre>

* Here, 5 is at its correct position

**Fourth Pass:**

* Now, the elements which are present in the sorted sub-array are 5, 11 and 12
* Moving to the next two elements 13 and 6

 <pre>  5   11   12   <b>13</b>   <b>6</b> </pre> 

* Clearly, they are not sorted, thus perform swap between both

<pre>   5   11  12  <b>6</b>   <b>13</b>  </pre>

* Now, 6 is smaller than 12, hence, swap again

<pre>   5   11  <b>6</b>   <b>12</b>  13</pre>

* Here, also swapping makes 11 and 6 unsorted hence, swap again

<pre>   5   <b>6</b>   <b>11</b>  12  13  </pre>

* Finally, the array is completely sorted.

<center><img src='images/insertion-sort-illustration.png' alt='Insertion Sort Illustration'></center>

</pre>
</i>

<br>

**<u>Pseudo Code</u>**

<pre>
procedure insertionSort(A: list of sortable items)
   n = length(A)
   for i = 1 to n - 1 do
       j = i
       while j > 0 and A[j-1] > A[j] do
           swap(A[j], A[j-1])
           j = j - 1
       end while
   end for
end procedure
</pre>

This algorithm sorts an array of items by repeatedly taking an element from the unsorted portion of the array and inserting it into its correct position in the sorted portion of the array.

1. The procedure takes a single argument, ‘A’, which is a list of sortable items.
2. The variable ‘n’ is assigned the length of the array A.
3. The outer for loop starts at index ‘1’ and runs for ‘n-1’ iterations, where ‘n’ is the length of the array.
4. The inner while loop starts at the current index i of the outer for loop and compares each element to its left neighbor. If an element is smaller than its left neighbor, the elements are swapped.
5. The inner while loop continues to move an element to the left as long as it is smaller than the element to its left.
6. Once the inner while loop is finished, the element at the current index is in its correct position in the sorted portion of the array.
7. The outer for loop continues iterating through the array until all elements are in their correct positions and the array is fully sorted.

<br>
<br>

---

<br>

**Advantages of Insertion Sort**

* The main advantage of the insertion sort is its simplicity.
* It also exhibits a good performance when dealing with a small list.
* The insertion sort is an in-place sorting algorithm so the space requirement is minimal.

<br>

**Disadvantages of Insertion Sort**

* The disadvantage of the insertion sort is that it does not perform as well as other, better sorting algorithms
* With n-squared steps required for every n element to be sorted, the insertion sort does not deal well with a huge list.
* The insertion sort is particularly useful only when sorting a list of few items.

<br>
<br>

---

<br>

* **Time Complexity:**
    * Best:     O(n)
    * Worst:    O(n<sup>2</sup>)
    * Average:  O(n<sup>2</sup>)

* **Space Complexity:** O(1)

<br>
<br>

---

<br>

**Is the Insertion sort algorithm stable?**


>Yes, the insertion sort algorithm is stable.

<br>
<br>

---

<br>

**Insertion Sort Applications**

The insertion sort is used when:

* The array is has a small number of elements
* There are only a few elements left to be sorted
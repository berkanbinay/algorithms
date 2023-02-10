# Shell Sort

Shell sort is a generalized version of the <u>insertion sort</u> algorithm. It first sorts elements that are far apart from each other and successively reduces the interval between the elements to be sorted.

<br>
<br>

## How Does Bubble Sort Work?

<br>

1. Suppose, we need to sort the following array.

![Initial array](images/initial-arr.png)

2. We are using the shell's original sequence *(N/2, N/4, ...1)* as intervals in our algorithm.

In the first loop, if the array size is *N = 8* then, the elements lying at the interval of *N/2 = 4* are compared and swapped if they are not in order.<br>
a. The 0th element is compared with the *4<sup>th</sup>* element.<br>
b. If the 0th element is greater than the *4<sup>th</sup>* one then, the *4<sup>th</sup>* element is first stored in *temp* variable and the *0<sup>th</sup>* element (ie. greater element) is stored in the *4<sup>th</sup>* position and the element stored in *temp* is stored in the *0<sup>th</sup>* position.

![Rearrange the elements at n/2 interval](images/n-2-interval.png)


This process goes on for all the remaining elements.

![Rearrange all the elements at n/2 interval](images/n-2-interval-2.png)

3. In the second loop, an interval of *N/4 = 8/4 = 2* is taken and again the elements lying at these intervals are sorted.

![Rearrange the elements at n/4 interval](images/n-4-interval.png)

You might get confused at this point.

![All the elements in the array lying at the current interval are compared.](images/n-4-interval-2.png)


The elements at *4<sup>th</sup>* and *2<sup>th</sup>* position are compared. The elements at *2<sup>th</sup>* and *0<sup>th</sup>* position are also compared. All the elements in the array lying at the current interval are compared.

4. The same process goes on for remaining elements.

![Rearrange all the elements at n/4 interval](images/n-4-interval-3.png)

5. Finally, when the interval is *N/8 = 8/8 = 1* then the array elements lying at the interval of 1 are sorted. The array is now completely sorted.

![Rearrange all the elements at n/4 interval](images/n-8-interval.png)

<br>
<br>

---

<br>

**Advantages of Shell Sort**

* Efficient for medium-size lists.

<br>

**Disadvantages of Shell Sort**

* Somewhat complex algorithm, not nearly as efficient as the merge, heap, and quick sorts.

<br>
<br>

---

<br>

* **Time Complexity:** 
    * Best: O(nlog n)
    * Avarage: O(n*log(n)<sup>2</sup>)
    * Worst: O(n<sup>2</sup>)
* **Space Complexity:** O(1)

<br>
<br>

---

<br>

**Is the Shell Sort algorithm stable?**


>No, the shell sort algorithm isn't stable.

<br>
<br>

---

**Shell Sort Applications**

Shell sort is used when:

* Replacement for insertion sort, where it takes a long time to complete a given task.
* To call stack overhead we use shell sort.
* when recursion exceeds a particular limit we use shell sort.
* For medium to large-sized datasets.
* In insertion sort to reduce the number of operations.
* Insertion sort does not perform well when the close elements are far apart. Shell sort helps in reducing the distance between the close elements. Thus, there will be less number of swappings to be performed.


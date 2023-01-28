# Bucket Sort

**Bucket sort** or **bin sort** is a sorting algorithm that works by distributing the elements into a number of buckets, homogenously. Each bucket is then sorted individually. In order to sort the bucket, we use the sort() method of the Arrays class. It is usually used to <u>sort floating-point numbers</u>.

<br>
<br>

## How Does Bucket Sort Works?

<br>

<pre>
<b>arr[]=22, 45, 12, 8, 10, 6, 72, 81, 33, 18, 50, 14</b>

Total number of elements in the given array (N) = 12

Max element in array = 81

Min element in array = 6

<center><img src="images/array.png" alt="Array"></center>

We need <b>10</b> buckets to sort the array. Suppose, these 10 buckets are represented as <b>B</b>s. After that, we need to find a divider that will be used to put the elements in the bucket. In order to determine the divider, we use the following formula:

<center><img src="images/divider-formula.png" alt="Divider Formula"></center>

Let's put the values in the above formula, we get:

<center><img src="images/divider-example.png" alt="Divider Example"></center>

Hence, bucket = 10, divider = 9

Let's put the element arr[i] in the correct bucket, we will use the following formula:

<center><img src="images/b-formula.png" alt="B Example"></center>

Let's see how it works by putting elements in the buckets. We will start from the first index.

<b>For i=0:</b>

<center><img src="images/i-0.png" alt="i=0"></center>

We will insert the <b>zeroth</b> element <b>(22)</b> in the <b>2<sup>nd</sup></b> bucket and increment the array index (i) by 1.

<b>For i=1:</b>

<center><img src="images/i-1.png" alt="i=1"></center>

We will insert the <b>first</b> element <b>(45)</b> in the <b>5<sup>th</sup></b> bucket and increment the array index (i) by 1.

<b>For i=2:</b>

<center><img src="images/i-2.png" alt="i=2"></center>

We will insert the <b>second</b> element <b>(12)</b> in the <b>1<sup>st</sup></b> bucket and increment the array index (i) by 1.

<b>For i=3:</b>

<center><img src="images/i-3.png" alt="i=3"></center>

We will insert the <b>third</b> element <b>(8)</b> in the <b>0<sup>th</sup></b> bucket and increment the array index (i) by 1.

<b>For i=4:</b>

<center><img src="images/i-4.png" alt="i=4"></center>

We will insert the <b>fourth</b> element <b>(10)</b> in the <b>1<sup>st</sup></b> bucket and increment the array index (i) by 1.

<b>For i=5:</b>

<center><img src="images/i-5.png" alt="i=5"></center>

We will insert the <b>fifth<b> element <b>(6)</b> in the <b>0<sup>th</sup></b> bucket and increment the array index (i) by 1.

<b>For i=6:</b>

<center><img src="images/i-6.png" alt="i=6"></center>

We will insert the <b>sixth</b> element <b>(72)</b> in the <b>8<sup>th</sup></b> bucket and increment the array index (i) by 1.

<b>For i=7:</b>

<center><img src="images/i-7.png" alt="i=7"></center>

We will insert the <b>seventh</b> elements <b>(81)</b> in the <b>8<sup>th</sup></b> bucket and increment the array index (i) by 1.

<b>For i=8:</b>

<center><img src="images/i-8.png" alt="i=8"></center>

We will insert the <b>eighth</b> element <b>(33)</b> in the <b>3<sup>rd</sup></b> bucket and increment the array index (i) by 1.

<b>For i=9:</b>

<center><img src="images/i-9.png" alt="i=9"></center>

We will insert the <b>ninth</b> elements <b>(18)</b> in the <b>2<sup>nd</sup></b> bucket and increment the array index (i) by 1.

<b>For i=10:</b>

<center><img src="images/i-10.png" alt="i=10"></center>

We will insert the <b>tenth</b> elements <b>(50)</b> in the <b>5<sup>th</sup></b> bucket and increment the array index (i) by 1.

<b>For i=11:</b>

<center><img src="images/i-11.png" alt="i=11"></center>

We will insert the <b>eleventh</b> elements <b>(14)</b> in the <b>1<sup>st</sup></b> bucket and increment the array index (i) by 1.

<center><img src="images/bucket.png" alt="bucket"></center>

Now, will perform <b>insertion</b> sort on the individual buckets to sort the elements. Let's start from the first bucket (<b>0<sup>th</sup></b>).

Is ? Yes, swap their positions.

<center><img src="images/insertion-0.png" alt="bucket0"></center>

Now, move to the next bucket (<b>1<sup>st</sup></b>) and compare each element to the other.

Is ? Yes, swap their positions and compare the next pair. Is ? No, elements are already in a sorted manner, so we will not swap their positions.

<center><img src="images/insertion-1.png" alt="bucket1"></center>

Now, move to the next bucket (<b>2<sup>nd</sup></b>) and compare their elements.

Is ? Yes, swap their positions.

<center><img src="images/insertion-2.png" alt="bucket2"></center>

Now, we will move to the next bucket. Here, a point to note that the bucket that has only one element is already sorted and the bucket that has no element, we will skip them. Therefore, we will move to the <b>fifth</b> bucket and compare their elements.

Is ? No, elements are already sorted. Similarly, trace the buckets until we reach the last bucket. So, we will stop here as we have got a sorted array.

<center><img src="images/sorted-bucket.png" alt="sorted-bucket"></center>

At last, we will take out all the elements from each bucket. Therefore, we get a sorted array.

<center><img src="images/sorted-array.png" alt="sorted-bucket"></center>

We have understood the logic of the bucket sort. Let's implement the logic in a Java program and perform bucket sorting over an array.
</pre>

<br>
<br>

---

<br>

**Advantages of Bucket Sort**

* It is asymptotically fast because of uniform distribution.
* It reduces the number of comparisons.
* It is fast in comparison to bubble sort.

<br>

**Disadvantages of Bucket Sort**

* It is not an in-place sorting because we need some extra space to sort the buckets.
* It may or may not be the stable sorting algorithm.
* It is not useful if we have large array because it increases the cost.

<br>
<br>

---

<br>

* **Time Complexity**
    * Best: O(n+k)
    * Worst: O(n2)
    * Avarage: O(n)
* **Time Complexity:** O(n+k)

<br>
<br>

---

<br>

**Is the Bucket Sort algorithm stable?**


>Bucket sort is not a stable sorting algorithm. If you remember,  A sorting algorithm is said to be stable if two objects with equal keys appear in the same order in sorted output as they appear in the input array to be sorted.


<br>
<br>

---

<br>

**Bucket Sort Applications**
<br>
Bucket sort is used when:

* Input is uniformly distributed over a range.
* There are floating point values
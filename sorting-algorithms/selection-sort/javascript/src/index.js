function selectionSort(arr) { 
    let length = arr.length;
        
    for(let i = 0; i < length; i++) {
        // Finding the smallest number in the subarray
        let min = i;
        for(let j = i+1; j < length; j++){
            if(arr[j] < arr[min]) {
                min=j; 
            }
         }
         if (min != i) {
             // Swapping the elements
             let tmp = arr[i]; 
             arr[i] = arr[min];
             arr[min] = tmp;      
        }
    }
    console.log('Sorted Array -> ', arr)
}

var arr = [5, 2, 4, 6, 1, 2];
console.log('Unsorted Array -> ', arr)
selectionSort(arr)
function bubbleSort(arr) {
    var length = arr.length;
    for(let i = 0; i < length; i++) {
        for(let j = 0; j < length - i -1; j++) {
            if(arr[j] > arr[j+1]) {
                let temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    console.log("Sorted Array -> ", arr);
}

var arr = [23, 16, 55, 44, 48];
console.log("Unsorted Array -> ", arr);
bubbleSort(arr);
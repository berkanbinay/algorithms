void main(List<String> arguments) {
  List<int> arr = [55, 16, 23, 48, 41, 34];
  print('Unsorted array -> $arr\n');
  List<int> sortedArr = bubbleSort(arr);
  print('\nSorted arr -> $sortedArr');
}

List<int> bubbleSort(List<int> arr) {
  int length = arr.length;
  int temp;
  for (int i = 0; i < length - 1; i++) {
    for (int j = 0; j < length - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
    print('Step ${i + 1} -> $arr');
  }
  return arr;
}

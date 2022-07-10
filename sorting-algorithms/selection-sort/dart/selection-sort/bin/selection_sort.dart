void selectionSort(List<int> arr) {
  int n = arr.length;
  for (int i = 0; i < n - 1; i++) {
    int indexMin = i;
    for (int j = i; j < n - 1; j++) {
      if (arr[j] < arr[indexMin]) {
        indexMin = j;
      }
    }
    if (i != indexMin) {
      var temp = arr[i];
      arr[i] = arr[indexMin];
      arr[indexMin] = arr[i];
    }
  }
}

void main(List<String> arguments) {
  var arr = [8, 1, 77, 12, 67, 5, 19, 4, 7, 10, 100];
  print('before arr -> $arr');
  selectionSort(arr);
  print('after arr -> $arr');
}

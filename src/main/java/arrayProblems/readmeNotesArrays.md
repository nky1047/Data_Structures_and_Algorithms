

**reverseTheArray_1:**

public static List<int[]> reverseTheArray_1(int[] arr){
    List<int[]> array = Arrays.asList(arr);
    int left=0, right =array.size()-1;
    while(left<right){
        Collections.swap(array,left,right);

Here above code has a Problem:
•   arr is a primitive int[].
•	Arrays.asList(arr) creates a List<int[]> with one element — the entire array — not a list of individual integers.
•	So, array.size() will return 1, and Collections.swap() on it will cause index out of bounds or no effect.

SO CORRECT APPROACHES ARE ::

1. public static List<Integer> reverseTheArray(List<Integer> arr) {
    int left = 0, right = arr.size() - 1;
        while (left < right) {
            Collections.swap(arr, left, right);

2. public static int[] reverseTheArray_1(int[] arr) {
   int left = 0, right = arr.length - 1;
     while (left < right) {
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           left++;
           right--;
   }

**2. PROBLEM WITH int[] and List<Integer> initialization**
int mainArr[] = {10,12,45,23,5,23,23,66,23,47,77};
List<Integer> arr = Arrays.asList(mainArr);

This will NOT work as you expect.

Reason:
•	mainArr is a primitive int[].
•	Arrays.asList(mainArr) will return a List with one element, and that element is the entire array int[].
•	So arr.size() will be 1, and each arr.get(i) will not return an Integer, it will return the whole array!

Fix:
You need to convert the int[] into a List<Integer>. You can do this using Java Streams or a loop.

Option1:
    int[] mainArr = {10, 12, 45, 23, 5, 23, 23, 66, 23, 47, 77};
    
    List<Integer> arr = Arrays.stream(mainArr)
    .boxed()
    .collect(Collectors.toList());

Option2:
    int[] mainArr = {10, 12, 45, 23, 5, 23, 23, 66, 23, 47, 77};
    
    List<Integer> arr = new ArrayList<>();
    for (int num : mainArr) {
    arr.add(num);
    }
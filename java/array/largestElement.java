// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LargetElement {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
         int arr[] = {1, 5, 3, 55, 7, 19, 10};
        System.out.println("largest element-->>" + getLargestElement(arr));
    }
    //
    // It will check the largest element in the array
    // Time Complexity = O(n)
    // Space Complexity = O(1)
    //
    static int getLargestElement(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        
        int n = arr.length;
        int largestEl = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largestEl) {
                largestEl = arr[i];
            }
        }
        return largestEl;
    };

}

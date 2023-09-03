// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Sort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 7,9,1,10,1};
        System.out.println("Is Array Sorted in ascending-->>" + isArraySortedIncreasing(arr));
    }
    //
    // This method will check array is sorted in ascending order or not.
    // It will return boolean 'true' if sorted otherwise 'false'
    // Time Complexity = O(n)
    // Space Complexity = O(1)
    //
    static boolean isArraySortedIncreasing(int[] arr) {
        if (arr.length == 0) {
            return true;
        }
        
        int n = arr.length;
        int prevNum = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] >= prevNum) {
                prevNum = arr[i];
            }else{
                return false;
            }
        }
        return true;
    };

    void bubbleSort(int arr[], int n){
        int temp;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]> arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }

    //Time Complexity= O(n^2);
    // Space Complexity = O(1);

}

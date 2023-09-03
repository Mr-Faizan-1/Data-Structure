class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int arr[] = {10, 5, 7, 30};
        reverseArr(arr);
    }
    
    static void reverseArr(int arr[]) {
        int lowInd = 0;
        int highInd = arr.length - 1;
        while (lowInd < highInd) {
            // Swap elements at lowInd and highInd
            int temp = arr[lowInd];
            arr[lowInd] = arr[highInd];
            arr[highInd] = temp;
            lowInd++;
            highInd--;
        }
        
        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
// Time Complexity = O(n)
// Space complexity = O(1)

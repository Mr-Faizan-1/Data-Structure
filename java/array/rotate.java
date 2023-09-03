class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        leftRotateByOne(arr, n); // Call the leftRotateByOne method


// ***********************************************

        int arrWithZero[] = {1, 0, 3, 4, 0, 6, 7};
        int m = arrWithZero.length;
        moveZeroToEnd(arr, m); // Call the moveZeroToEnd method
    }

    // Method to left rotate an array by one position
    public static void leftRotateByOne(int arr[], int n) {
        int firstElem = arr[0]; // Store the first element of the array

        // Shift elements one position to the left
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = firstElem; // Place the first element at the end

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    
    // Time Complexity = Theta(n)
    // Space Complexity = Theta(1)





    // move zero to last 
    public static void moveZeroToEnd(int arrWithZero[], int m) {
        int count = 0; // Initialize a count to keep track of non-zero elements

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            if (arrWithZero[i] != 0) {
                // Swap the non-zero element with the first zero element (if any)
                int tempVal = arrWithZero[i];
                arrWithZero[i] = arrWithZero[count];
                arrWithZero[count] = tempVal;
                count++; // Increment the count of non-zero elements
            }
        }

        // Print the modified array
        for (int i = 0; i < n; i++) {
            System.out.println(arrWithZero[i]);
        }
    }

        // Time Complexity = Theta(n)
    // Space Complexity = Theta(1)
}

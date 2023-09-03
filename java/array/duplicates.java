class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 30};
        int n = arr.length;
        int resInd = removeDuplicates(arr, n); // Call the removeDuplicates method
        for (int i = 0; i < resInd; i++) {
            System.out.println(arr[i]); // Print the unique elements of the array
        }
    }

    // Method to remove duplicates from an array and return the updated length
    public static int removeDuplicates(int arr[], int n) {
        if (n == 0 || n == 1)
            return n;

        int resInd = 1; // Index to keep track of the unique elements

        // Iterate through the array to remove duplicates
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[resInd - 1]) { // If the current element is different from the previous one
                arr[resInd] = arr[i]; // Update the unique element in the array
                resInd++; // Increment the index for unique elements
            }
        }

        return resInd; // Return the updated length of the array
    }
}

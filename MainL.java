// Sorting Algorithm (Max to Min)
// Bubble sorting algorithm
// Ascending Order
// To quicklu know if ASC or DSC, check the operator "<" or "">"
// if (arr[j] < arr[j + 1])  


public class MainL {
    void mainL (int[] arr) {  // Method to sort the array
        for (int i = 0; i < arr.length - 1; i++) {  // Outer loop for each pass
            for (int j = 0; j < arr.length - i - 1; j++) {  // Inner loop for comparisons
                // Change comparison to sort in descending order
                if (arr[j] < arr[j + 1]) {  // Swap if the current element is smaller than the next element
                    int temp = arr[j];  // Temporary variable to hold the current element
                    arr[j] = arr[j + 1];  // Swap the elements
                    arr[j + 1] = temp;  // Complete the swap
                }
            }
        }

        // Print sorted array
        for (int i : arr) System.out.println(i);  // Print each element of the sorted array
    }

    public static void main(String[] args) {
        new MainL().mainL(new int[]{4, 2, 5, 1, 3});  // Create an instance of MainL and call mainL with an unsorted array
    }
}


// Detailed Explanation:
// public class MainL {

// Defines a class named MainL.
// void mainL (int[] arr) {

// Defines a method named mainL that takes an integer array arr as an argument. This method will perform the sorting.
// for (int i = 0; i < arr.length - 1; i++) {

// The outer loop runs arr.length - 1 times. Each iteration ensures that the largest element "bubbles" up to its correct position.
// for (int j = 0; j < arr.length - i - 1; j++) {

// The inner loop runs through the unsorted part of the array. With each pass of the outer loop, the number of elements to compare decreases (-i), as the end of the array gets sorted.
// if (arr[j] < arr[j + 1]) {

// Compares adjacent elements. If the current element arr[j] is smaller than the next element arr[j + 1], they are swapped to sort in descending order.
// int temp = arr[j];

// A temporary variable temp is used to hold the value of arr[j] during the swap process.
// arr[j] = arr[j + 1];

// Assigns the value of arr[j + 1] to arr[j], effectively moving the larger element to the position of the smaller element.
// arr[j + 1] = temp;

// Assigns the value held in temp (original arr[j]) to arr[j + 1], completing the swap.
// for (int i : arr) System.out.println(i);

// After sorting, this loop prints each element of the sorted array to the console.
// public static void main(String[] args) {

// The main method, which is the entry point of the Java application.
// new MainL().mainL(new int[]{4, 2, 5, 1, 3});

// Creates an instance of MainL and calls the mainL method, passing an unsorted array {4, 2, 5, 1, 3} to be sorted.
// This implementation of Bubble Sort sorts the array in descending order by swapping elements when the current element is smaller than the next one.
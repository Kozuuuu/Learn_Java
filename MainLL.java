// Sorting Algorithm (Min to Max)
// Bubble sorting algorithm
// Ascending
// To quicklu know if ASC or DSC, check the operator "<" or "">"
// if (arr[j] > arr[j + 1])  

public class MainLL {
    void mainLL (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Change comparison to sort in descending order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        for (int i : arr) System.out.println(i);
    }

    public static void main(String[] args) {
        new MainLL().mainLL(new int[]{4, 2, 5, 1, 3}); 
    }
}

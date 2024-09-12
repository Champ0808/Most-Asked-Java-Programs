import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {64, 34, 25, 12, 22};  // Array to be sorted
        System.out.println("Array before sorting: " + Arrays.toString(a));

        int n = a.length;  // Length of the array

        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {  // Outer loop for number of passes
            for (int j = 0; j < n-1; j++) {  // Inner loop for each pass
                // Swap if elements are in wrong order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Array after sorting: " + Arrays.toString(a));  // Print sorted array
    }
}

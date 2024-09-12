import java.util.*;
public class SortingElements {
    // Approach 1 - parallelsort
    public static void main(String[] args) {
        // int a[]={20,40,15,38,90,45};

        // System.out.println("Array elements before sorting"+Arrays.toString(a));
        // Arrays.parallelSort(a);
        // System.out.println("Array elements after sorting"+Arrays.toString(a));

        // Approach 2 - sort
        // int a[]={20,40,15,38,90,45};

        //  System.out.println("Array elements before sorting"+Arrays.toString(a));
        //  Arrays.sort(a);
        //  System.out.println("Array elements after sorting"+Arrays.toString(a));

        // Approach 3 - Reverse
        Integer a[]={20,40,15,38,90,45};// Using derived data type i.e Integer instead of primitive int

        System.out.println("Array elements before sorting"+Arrays.toString(a));
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("Array elements after sorting"+Arrays.toString(a));
        
    }
    
}

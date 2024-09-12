import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7,8,9,10};// Should be in sorted order
        /* 
        boolean flag=false;
        int key=10;
        int l=1;
        int h=a.length-1;

        while(l<=h){
            int mid=(l+h)/2;
        
        {
            if(a[mid]==key){
            System.out.println("Element Found...");
            flag=true;
            break;
        }
            if(a[mid]<key){
            l=mid+1;
        }
            if(a[mid]>key){
            h=mid-1;
        }
    }
}
if(flag==false){
    System.out.println("Element NOT found..");
}*/
// Approach 2 - Arrays.BinarySearch(a,key)
        int key = 7;  // The element we want to search for
        int result = Arrays.binarySearch(a, key);  // Perform binary search

        // Check the result of binary search
        if (result >= 0) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
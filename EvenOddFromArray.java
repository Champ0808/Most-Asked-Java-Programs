public class EvenOddFromArray {
    public static void main(String[] args) {
        int a[]={3,2,4,5,6,7,9};
        System.out.println("Even numbers in array are......");
        /*
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
            System.out.println(a[i]);
        }*/
        // Enhnaced for loop
        for(int value:a){
            if(value%2==0)
            System.out.println(value);
        }
        System.out.println("Odd numbers in array are......");
        /*
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0)
            System.out.println(a[i]);
        }*/
        for(int value:a){
            if(value%2!=0)
            System.out.println(value);
        }
    }
    
}

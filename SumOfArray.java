public class SumOfArray {
    public static void main(String[] args) {
        int a[]={3,5,2,8,9};
        int sum=0;
        /* 
        for(int i=0;i<=a.length-1;i++)// a.length-1=5-1=4
        {
            sum=sum+a[i];
        }*/
        // Enhanced for loop
        for(int value:a){
            sum=sum+value;
        }
        System.out.println("The Sum of Array is "+sum);
    }
    
}

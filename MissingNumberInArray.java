public class MissingNumberInArray {
    public static void main(String[] args) {
        // Arrays should not have duplicates
        // Arrays No need to be sorted order
        // Values should be in range 

        int a[]={1,2,4,5,6,7};
        //1+2+4+5+6+7=25  sum1
        // 1+2+3+4+5+6+7=28  sum2
        // sum2-sum1= missing number i.e 3

        int sum1=0;
        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
        }
        System.out.println("The Sum of array is" +sum1);
    
        int sum2=0;
        for(int i=1;i<=7;i++){
            sum2=sum2+i;
        }
        System.out.println("The Sum of range of array is" +sum2);


        }
        System.out.println("The Missing number is" +(sum2-sum1));

    }


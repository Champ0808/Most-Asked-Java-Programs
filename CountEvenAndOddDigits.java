public class CountEvenAndOddDigits{
    public static void main(String[] args){
        int n=1254368;
        int even_count=0;
        int odd_count=0;

        while(n>0){
            int rem=n%10; // extract last digit  8  6   3   4   5   2   1
            if(rem%2==0){
                even_count++;// 1-> 2-->3->4
            }else{
                odd_count++;// 1->2->3
            }
            n=n/10; //Remove  8    6   3   4    5   2   1
        }
        System.out.println("Number of even_digits:"+even_count);
        System.out.println("Number of Odd_digits:"+odd_count);

    }
}

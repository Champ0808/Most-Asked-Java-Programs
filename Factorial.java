//5!=1*2*3*4*5
//5!=5*4*3*2*1

public class Factorial {
    public static void main(String[] args) {
        int n=6 ;
        long factorial=1;
        /* 
        for(int i=1;i<=n;i++)// 1 1<5   2 2<5   3 3<5   4 4<5   5 5<5
        {
            factorial=factorial*i;// 1*1=1  1*2=2   2*3=6   6*4=24  24*5=120
        }*/

        for(int i= n;i>=1;i--)
        {
            factorial=factorial*i;
        }
        System.out.println("The factorial of number is "+factorial);

    }
    
}

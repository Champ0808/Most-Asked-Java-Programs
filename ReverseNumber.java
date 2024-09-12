import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();

        // logic 1
        /*int rev=0;
        while(num!=0){
            rev=rev*10+num%10;// 0*10+1234%10= 0+4=4        4*10+123%10=40+3=43         43*10+12%10=430+2=432           432*10+1%10=4320+1=4321
            num=num/10;      // 1234/10=123    123!=0       123/10=12       12!=0       12/10=1     1!=0                1/10=0    Now 0=0
        }*/


        // logic 2  Using StringBuffer Class
        /*StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();*/

        // logic 3 Using String
        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();





        System.out.println("Reverse number is:"+rev);
    }
    
}

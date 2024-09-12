import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int org_num=num;
        int rev=0;
        while(num!=0){// 121 12     1
            rev=rev*10+num%10;// 0+1=1  10+2=12 120+1=121
            num=num/10;// 12    1   0
        }
        System.out.println(rev);

        if(org_num==rev){
            System.out.println(org_num+" Palindrome Number");
        }else{
            System.out.println(org_num+" Not Palindrome Number");

        }
    }
}

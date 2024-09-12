import java.util.Scanner;
public class LargestOfThreeNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Enter third number:");
        int c=sc.nextInt();

        // Logic 1
       /*  if(a>b&& a>c){
            System.out.println(a+" is largest number");
        }else if(b>a&&b>c){
            System.out.println(b+" is largest number");

        }else{
            System.out.println(c+" is largest number");*/
            
        // Ternary Operators
        /*  largest=a>b?a:b;// largest of a and b if a>b if true print a and if false b
        largest=c>largest?c:largest; 

        System.out.println(largest+" is largest number");*/

        int largest=c>(a>b?a:b)?c:(a>b?a:b);

        System.out.println(largest+" is largest number");

        }
    }


import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        String org_str=str;
        String rev="";
        int leng=str.length();
        for(int i=leng-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

        if(org_str.equals(rev)){
            System.out.println(org_str+" Palindrome String");

        }else{
            System.out.println(org_str+" Not Palindrome String");

        }
    }
    
}

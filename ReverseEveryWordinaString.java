import java.util.*;
public class ReverseEveryWordinaString {
    public static void main(String[] args) {
        /*Approach 1  
        String str="Welcome TO Java";
        String words[]=str.split(" ");
        String reverseString="";
        for(String w:words){
            String reverseWord="";
            for(int i=w.length()-1;i>=0;i--){
                reverseWord=reverseWord+w.charAt(i);
            }
            reverseString=reverseString+reverseWord+" ";
        }
        System.out.println(reverseString);*/
        // Approach2 - 
        String str="Welcome TO Java";
        String words[]=str.split(" ");
        String reverseWord=" ";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
        
        reverseWord=reverseWord+sb.toString()+" ";
    }
    System.out.println(reverseWord.trim()); // trim() to remove trailing space

}
}

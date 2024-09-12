public class CountCharacterOccurence {
    public static void main(String[] args) {
        String s="Java Programming Java oops language";
        int total_count=s.length();
        int total_count_after_Remove=s.replace("a","").length();
        int count=total_count-total_count_after_Remove;
        System.out.println(count);
    }
    
}

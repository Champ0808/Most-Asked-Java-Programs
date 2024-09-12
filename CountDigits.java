public class CountDigits {
    public static void main(String[] args) {
        int num=123456;
        int count=0;
        while(num>0){
            num=num/10; // 123456/10=12345      12345>0 12345/10=1234
            count++;    // count =1             count=2
        }
        System.out.println("The number of digits:"+count);
    }
    
}

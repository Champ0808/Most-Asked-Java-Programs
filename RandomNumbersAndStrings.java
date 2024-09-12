import java.util.Random;

public class RandomNumbersAndStrings {
    public static void main(String[] args) {
        // Approach 1 - Random 

        /* Random rand=new Random();
        int rand_int=rand.nextInt(100);// Any random number between 0 to 99
        System.out.println(rand_int);*/

        // Approach 2- Math
        //System.out.println(Math.random()); // decimal always


        // Approach 3- Apache Commons-lang API
        String randStr=RandomStringUtils.randomNumeric(10);
        System.out.println(randStr);
    }
    
}

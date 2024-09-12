public class PrimeNumber {
    public static void main(String[] args) {
        int num=6;
        int count=0;// count used to count factors of number

        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%i==0)
                count++;
            }
            if(count==2){

                System.out.println(num+" is a prime number");

            }else{
                System.out.println(num+" Not a prime number");
            }
        }else{
            System.out.println(num+" Not a prime number");
        }
    }
}

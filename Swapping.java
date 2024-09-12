public class Swapping {
    public static void main(String[] args){
        int a=10,b=20;
        System.out.println("Before Swapping a and b..."+a+" "+b);
        //logic 1 temproray variable

        /*int t=a; // t=10
        a=b;// a= 20
        b=t; // b=10*/

        // logic 2    + & - without temproray varibale
        /* 
        a=a+b;
        b=a-b;
        a=a-b;*/


        // logic 3  * & / 
        /*
        
        a=a*b;
        b=a/b;
        a=a/b;*/


        // logic 4   ^(XOR)
        /* 
        a=a^b;
        b=a^b;
        a=a^b;*/

        // logic 5   Single Statement
        // a=10; b=20;
        b=a+b-(a=b);// execution from right to left a=b which means 20 is assigned as 10

        System.out.println("Before Swapping a and b..."+a+" "+b);

    }
    
}

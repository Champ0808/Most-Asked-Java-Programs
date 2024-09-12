public class ReverseString {
    public static void main(String[] args) {
        String str="ABCD";//4 
        String rev="";
        // 1. Logic Using String Concatenation
        /*int leng=str.length();
        for(int i=leng-1;i>=0;i--){//  leng-1=4-1=3  i--=3-1=2      1   0
            rev=rev+str.charAt(i);//   charAt(3)=D   charAt(2)=C    B   A

        }*/

        // 2. Logic using cahrArray
        /*char a[]=str.toCharArray();
        int leng=a.length;//4
        for(int i=leng-1;i>=0;i--){
            rev=rev+a[i];
        }*/


        //3. Logic Using StringBuffer
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());




        
    }
    
}

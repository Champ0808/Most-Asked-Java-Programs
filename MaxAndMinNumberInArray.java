public class MaxAndMinNumberInArray {
    public static void main(String[] args)
     {/* 
        int a[]={20,40,70,60,90};
        int max=a[0];// assuming 1st number as max

        for(int i=1;i<a.length;i++){// 1    2
            if(a[i]>max){// 40>20           70>40
                max=a[i];// repalce max as 40   70
            }
        }
        System.out.println("The max number in array is:"+max);*/

        int a[]={30,40,70,20,60,90};
        int min=a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("The min number in array is:"+min);

    }
}

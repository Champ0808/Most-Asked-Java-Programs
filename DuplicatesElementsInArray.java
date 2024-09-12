import java.util.HashSet;
public class DuplicatesElementsInArray {
    public static void main(String[] args) {
        // Approach 1
        /* 
        String arr[]={"java","python","c++","c","Java"};
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j]){

                
                System.out.println("Found Duplicate Elemnet:"+arr[i]);
                flag=true;
                }
            }
        }
        if(flag==false)
        System.out.println("Duplicate not found");*/
        
        //Approach 2 HashSet   HashSet returns false if any duplicate found in array
        String arr[]={"java","python","c++","c","java"};
        HashSet <String> langs=new HashSet();
        // Using enhanced for loop
        boolean flag=false;
        for(String l:arr){// array elemnts into l 
            if(langs.add(l)==false)
            {
                System.out.println("Found Duplicate Elemnt:"+l);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("Duplicate not found");

        }


    }
}

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={10,40,30,60,80};
        int search_ele=10;

        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(search_ele==a[i]){
                System.out.println("Element Found at "+i);
                flag=true;
                break;

            }
        }
        if(flag==false){
            System.out.println("Element not found in array");
        }
    }
    
}

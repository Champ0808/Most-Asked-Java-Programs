public class RemoveJunk {
    public static void main(String[] args) {
        String s="@#$%^&* Gaurav Raju Takale 8308409761";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
    
}

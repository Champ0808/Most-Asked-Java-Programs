public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String s="Gaurav   Raju  Takale ";
        s=s.replaceAll("\\s", "");
        System.out.println(s);

    }
    
}

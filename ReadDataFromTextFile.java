import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {
        // Approach 1 - Using FileReader and BufferedReader
        // Correctly specifying the file path with escaped backslashes
        /*FileReader fr = new FileReader("C:\\Users\\Gaurav\\Documents\\sample.txt");
        BufferedReader br = new BufferedReader(fr);
        String str;

        // Reading the file line by line
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        
        // Closing the BufferedReader
        br.close();*/

        //Approach 2 - Scanner and File
        File file=new File("C:\\Users\\Gaurav\\Documents\\sample.txt");
        Scanner sc=new Scanner(file);
        /*
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }*/

        // Approach 3 
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());


    }
}

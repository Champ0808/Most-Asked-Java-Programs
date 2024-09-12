import java.io.*;
public class WriteTextDataIntoFile {
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("C:\\Users\\Gaurav\\Documents\\Text123.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Hello World  \n");
        bw.write("Welcome to world of programming");
        System.out.println("Finished !!!");
    
    bw.close();
    }
}

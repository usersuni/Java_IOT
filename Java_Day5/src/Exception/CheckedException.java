package Exception;

import java.io.IOException;

public class CheckedException {
    static void readFile()throws IOException{
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
       try {
           display();
       }catch(IOException e){
           System.out.println(e.getMessage());
       }
    }static void display()throws IOException{
        readFile();
    }
}

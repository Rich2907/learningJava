import java.io.*;
public class handlingException{
    public static void main(String args[]){
        try{
        var reader=new FileReader("File.txt");
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found, write good names");
        }
    }
}
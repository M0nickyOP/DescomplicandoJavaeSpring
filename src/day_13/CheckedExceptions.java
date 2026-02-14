package day_13;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = null;

        try{
            fileInputStream = new FileInputStream("invalidpath.txt");
        }catch (FileNotFoundException e){
            System.out.println("Arquivo invalido!");
        }


    }
}
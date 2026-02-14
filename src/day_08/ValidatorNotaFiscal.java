package day_08;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class ValidatorNotaFiscal {
    public static void main(String[]args) throws FileNotFoundException {
        File file = new File ("src/day_08/nota-fiscal2");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
                System.out.print(sc.nextLine());
        }
    }
}

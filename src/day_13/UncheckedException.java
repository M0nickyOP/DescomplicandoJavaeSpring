package day_13;

public class UncheckedException {
    public static void main(String[] args) {
    try {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(array[100]);

    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Posição inválida!");
    }
    finally{
        System.out.println("Encerrando o programa...");
    }
    }
}

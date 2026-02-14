package day_12;

public class AutoandUnboxing {
    public static void main(String []args){
        //Autoboxing
        int valorInt = 10;
            Integer integer = valorInt;
            System.out.println( integer );
        //Unboxing
        Integer wrapperInteger = 33;
        int primitivo = wrapperInteger;
        System.out.println(primitivo);
    }
}

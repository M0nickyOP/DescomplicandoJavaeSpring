package day_12;

public class Widening {
        public static void main(String[] args) {
            int variavelInt = 123;
            long variavelLong = variavelInt;
            System.out.println(variavelInt);
            System.out.println(variavelLong);
            float variavelFloat = variavelLong;
            System.out.println(variavelFloat);
        }
}

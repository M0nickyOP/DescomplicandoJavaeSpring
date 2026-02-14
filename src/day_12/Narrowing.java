package day_12;



public class Narrowing {
    public static void main(String[] args) {
        double meuDouble = 1.99;
        System.out.println(meuDouble);

        int meuInt = (int)meuDouble;
        System.out.println(meuInt);

        String minhaStringInt = String.valueOf(meuInt);
        String minhaStringDouble = String.valueOf(meuDouble);

        System.out.println(minhaStringDouble);
        System.out.println(minhaStringInt);

        String s = "1";

        boolean b = Boolean.parseBoolean(s);
        System.out.println(b);

        float f = Float.parseFloat(s);
        System.out.println(f);

        int i = Integer.parseInt(s);
        System.out.println(i);

        short sht = Short.parseShort(s);
        System.out.println(sht);

        double d = Double.parseDouble(s);
        System.out.println(d);

        long l = Long.parseLong(s);
        System.out.println(l);

        byte bt = Byte.parseByte(s);
        System.out.println(bt);
    }
}

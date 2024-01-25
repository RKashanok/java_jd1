package pl.roka.it.lesson3;

public class TypesCasting extends Object {
    public static void main(String[] args) {
        // byte -> short -> int -> long
        byte a1 = 10;
        short a2 = 10;
        int a3 = 10;
        long a4 = 10;

        long result1 = a4;
        int result2 = (int) a4;
        short result3 = (short) a4;
        short result4 = (short) a3;
        short result5 = a2;
        byte result6 = (byte) (a1 + a2 + a3 + a4);
        Integer a = Integer.valueOf(10);
        short i = a.shortValue();

    }
}

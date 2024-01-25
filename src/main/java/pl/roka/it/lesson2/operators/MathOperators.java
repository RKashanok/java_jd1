package pl.roka.it.lesson2.operators;

public class MathOperators {
    /**
     * - Арифметические операторы
     * - Операторы сравнения
     * - Логические операторы
     * - Оператор присваивания
     * - Унарные операторы
     * */

    public static void main(String[] args) {
//        // + - * / %
//        int a = 55;
//        char b = 63;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a + b);
//        System.out.println("String " + a);
//
//        byte c = 1; // - 128 to 127
//        int d = 126;
//        long result = c + d;
//        System.out.println("result: " + result);
//
//
//
//        // / %
//        double a1 = 10;
//        double a2 = 3;
//        System.out.println(a1 / a2); // -> 10 = 3 + 3 + 3 + 1
//        System.out.println(a1 % a2); // -> 10 = 3 + 3 + 3 + 1

        // ++ -- => += 1; -= 1
        int k = 1;
        System.out.println(k);
        System.out.println(k++);
        System.out.println(k);
        System.out.println(++k);

        System.out.println(k--);
        System.out.println(--k);

        k += 1;
        k /= 2;
        k *= 2;
        k %= 2;
        k = k + 1;


    }
}

package pl.roka.it.lesson1;

import org.w3c.dom.ls.LSOutput;

public class Variables {

    public static void main(String[] args) {
        /*
        *    - Числовые
        *    - Символьные
        *    - Логические
        *    - Строковые
        * */

        /** Числовые типы данных */
        // 2 default types: int and double
//        System.out.println(1 + 1);

        byte b = 1;                     // 1 byte -> -128 to 127
        short s = 2;                    // 2 bytes -> -32768 to 32767
        int a = 3;                      // 4 bytes -> -2147483648 to 2147483647
        long l = 4_000_000_000L;        // 8 bytes -> -9223372036854775808 to 9223372036854775807

//        System.out.println(b + s);

        float f = 5.0f; // 4 bytes -> -3.4028235E38 to 3.4028235E38
        double d = 6.0; // 8 bytes -> -1.7976931348623157E308 to 1.7976931348623157E308

        // тип -> имя переменной -> = -> значение переменной

        /** Символьные типы данных */
        char c = 'W';
        System.out.println(c);
        System.out.println((int)c);

        /** Логические типы данных*/
        boolean truth = true;   // 3 > 1
        boolean lie = false;    // c > 'm'

    }
}

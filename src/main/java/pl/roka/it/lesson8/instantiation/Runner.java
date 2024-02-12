package pl.roka.it.lesson8.instantiation;

public class Runner {
    public static void main(String[] args) {

        Child child = new Child();

        /**
         *
         *  from static block. a = 1 and b = 0
         *  a = 1 and b = 2
         *
         *  from static block. g = 1 and h = 0
         *  g = 1 and h = 2
         *
         *  from NON static block. c = 3 and d = 0 and e = 5 and f = 0
         *  c = 3 and d = 4 and e = 5 and f = 6
         *  Parent constructor
         *  a = 1, b = 2, c = 3, d = 4, e = 5, f = 6
         *
         *  from NON static block. i = 3 and j = 0 and k = 5 and l = 0
         *  i = 3 and j = 4 and k = 5 and l = 6
         *  Child constructor
         *  g=1, h=2, i=3, j=4, k=5, l=6
         *
         *
         * */

    }
}

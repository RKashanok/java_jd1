package pl.roka.it.lesson13.generics;

public class GenericsRunner {
    public static void main(String[] args) {

        Box<Number> mmb = new Box(10);
        mmb.addToBox(100);
        mmb.addToBox(100.0);
        mmb.addToBox(100f);
        mmb.addToBox(100L);

        Box<String> mmb2 = new Box<>(10);
        mmb2.addToBox("test1");
        mmb2.addToBox("test2");
        mmb2.addToBox("test3");

        System.out.println(mmb.getAll().length);

        System.out.println(BoxUtils.getBoxOccupiedSlotsNumber(mmb));
        System.out.println(BoxUtils.getBoxOccupiedSlotsNumber(mmb2));

        BoxUtils.printInternalContainer(mmb2);

//        Object[] all = mmb.getAll();
//        for (Object s : all) {
//            System.out.println(s);
//        }
//
//        System.out.println("First: " + mmb.getFirst());
//
//        for (Object s : all) {
//            System.out.println(s);
//        }

    }
}

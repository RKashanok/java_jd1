package pl.roka.it.lesson9.overloadoverrid;

public class Runner {
    public static void main(String ... args) {
        Cat cat1 = new Cat();
        HomeAnimal cat2 = new Cat();
        Animal cat3 = new Cat();

        Puma puma1 = new Puma();
        WildAnimal puma2 = new Puma();
        Animal puma3 = new Puma();

        cat1.makeSound();
        cat1.makeSound(3, "Miiiiiiiiiau", "Start");
        cat1.makeSound(new Integer(3));
        cat1.makeSound(cat2);
    }
}

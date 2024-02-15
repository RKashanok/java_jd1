package pl.roka.it.lesson9.overloadoverrid;

public abstract class HomeAnimal extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Hau hau");
    }
}

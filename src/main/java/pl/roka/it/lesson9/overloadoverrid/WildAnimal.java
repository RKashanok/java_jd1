package pl.roka.it.lesson9.overloadoverrid;

public abstract class WildAnimal extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Hrrrrr");
    }
}

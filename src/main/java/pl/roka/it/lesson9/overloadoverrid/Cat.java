package pl.roka.it.lesson9.overloadoverrid;

public class Cat extends HomeAnimal {

    @Override
    public void makeSound() {
        System.out.println("Miau miau");
    }

    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Miau miau");
        }
    }

    public void makeSound(Integer times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Miau miau");
        }
    }

    public void makeSound(Object obj) {
        System.out.println("Miau miau");
    }

    public void makeSound(int times, String sound) {
        for (int i = 0; i < times; i++) {
            System.out.println(sound);
        }
    }

    public void makeSound(int times, String ... sounds) {
        if(sounds.length > 1) {
            System.out.println(sounds[1]);
        }
        for (int i = 0; i < times; i++) {
            System.out.println(sounds[0]);
        }
    }


}

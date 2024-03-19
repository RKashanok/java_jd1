package pl.roka.it.lesson17.input_output.object_isos;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
class Cat implements Serializable {

	private static final long serialVersionUID = 5566504814284968257L;

    private String name;
    private String color;
    private String breed;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

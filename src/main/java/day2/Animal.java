package day2;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        if (age >= 1 && age <= 10) {
            this.age = age;
        } else {
            this.age = 10;
        }
        if (name != null) {
            this.name = name;
        }else{
            this.name = "Animal";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

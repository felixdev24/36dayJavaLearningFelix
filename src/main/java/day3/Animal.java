package day3;

public class Animal {
    protected String name;
    protected int age;
    public Animal() {

    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("Eating...");
    }
    public void sleep() {
        System.out.println("Sleeping...");
    }

    public void play() {
        System.out.println("Playing...");
    }

    public void breath() {
        System.out.println("Breathing...");
    }
}

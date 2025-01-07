package day2;

public class GetterSetterC {
    public static void main(String[] args) {
        Animal animal = new Animal("Cho", 21);
        Animal animal2 = new Animal("Cho", 21);
        System.out.println(animal.getName());
        System.out.println();

        if(animal.equals(animal2)) {
            System.out.println("Animal is equal");
        }
        else {
            System.out.println("Animal is not equal");
        }
    }
}

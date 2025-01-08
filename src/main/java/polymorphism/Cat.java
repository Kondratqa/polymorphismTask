package polymorphism;

public class Cat extends Animal {

    public Cat(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }
    public void makeSound() {
        System.out.println("Cat мяукает");
    }
}

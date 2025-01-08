package polymorphism;

public class Cat extends Animal {

    public Cat(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }
    @Override
    public void makeSound() {
        System.out.println("Кот мяукает");
    }
}

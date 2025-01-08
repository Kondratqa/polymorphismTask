package polymorphism;

public class Dog extends Animal {
    public Dog(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }
    public void makeSound() {
        System.out.println("Dog гавкает");
    }
}

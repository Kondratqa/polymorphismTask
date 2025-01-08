package polymorphism;

public class Tigr extends Animal{
    public Tigr(String name, String color, int age,double weight) {
        super(name, color, age, weight);
    }
    public void makeSound() {
        System.out.println("Tigr рычит");
    }
}

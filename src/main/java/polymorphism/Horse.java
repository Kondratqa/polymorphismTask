package polymorphism;

public class Horse extends Animal {
    public Horse(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Лошадь ржет");
    }
    public void CarryTheRider() {
        System.out.println("Лошадь умеет возить всадника");
    }
}

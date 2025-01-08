package polymorphism;

public class Horse extends Animal {
    public Horse(String name, String color, int age, double weight, String sound) {
        super(name, color, age, weight, sound);

    }
    public void CarryTheRider() {
        System.out.println("Лошадь умеет возить всадника");
    }
}

package polymorphism;

public class Walrus extends Animal {
    public Walrus(String name, String color, int age, double weight, String sound) {
        super(name, color, age, weight, sound);
    }
    public void livesInTheOcean(){
        System.out.println("Морж может нырять и долго находиться под водой");
    }
}

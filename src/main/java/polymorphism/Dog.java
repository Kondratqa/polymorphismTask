package polymorphism;

public class Dog extends Animal {

    public Dog(String name, String color, int age, double weight, String sound) {
        super(name, color, age, weight, sound);

    }
    public void securityDog(){
        System.out.println("Собака охраняет");
    }
    public void theDogServes(){
        System.out.println("Собака может служить");
    }
}

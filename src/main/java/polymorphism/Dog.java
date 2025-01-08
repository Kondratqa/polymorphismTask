package polymorphism;

public class Dog extends Animal {
    public Dog(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }
    @Override
    public void makeSound() {
        System.out.println("Собака гавкает");
    }
    public void securityDog(){
        System.out.println("Собака охраняет");
    }
    public void theDogServes(){
        System.out.println("Собака может служить");
    }
}

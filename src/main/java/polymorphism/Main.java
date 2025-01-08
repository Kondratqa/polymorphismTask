package polymorphism;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Barsik", "Black", 3, 5, "Мяукает");
        Animal tigr = new Tigr("Sherhan", "Yelow", 5, 30, "Рычит");
        Animal dog = new Dog("Pit", "Grey", 5, 15, "Гавкает");
        Animal horse = new Horse("Mike", "Black", 5, 220, "Ржет");
        Animal walrus = new Walrus("Shi", "Brown", 4, 180, "Страшно рычит");

        polymorphism(cat);
        polymorphism(tigr);
        polymorphism(dog);
        polymorphismHorse(horse);
        polymorphismWalrus(walrus);

    }
    public static void polymorphism (Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).securityDog();
            ((Dog) animal).theDogServes();
        }
        animal.printAnimal();
    }
    public static void polymorphismHorse (Animal animal) {
        if (animal instanceof Horse) {
            ((Horse) animal).CarryTheRider();
        }
        animal.printAnimal();
    }
    public static void polymorphismWalrus (Animal animal) {
        if (animal instanceof Walrus) {
            ((Walrus) animal).livesInTheOcean();
        }
        animal.printAnimal();
    }
}

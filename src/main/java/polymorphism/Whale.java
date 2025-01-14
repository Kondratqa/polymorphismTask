package polymorphism;

public class Whale extends Animal {
    public Whale(String name, String color, int age, double weight, String sound) {
        super(name, color, age, weight, sound);
    }
    public void whaleOcean(){
        System.out.println("Касатка млекопитающее животное, очень умное и сообразительное существо");
    }
    public void whaleOcean2(){
        System.out.println("Дыхательные органы находятся на спине");
    }
}

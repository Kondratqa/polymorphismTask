package polymorphism;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int age;
    protected double weight;
    protected String sound;

    public Animal(String name, String color, int age, double weight, String sound) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getSound() {
        return sound;
    }

    public void printAnimal(){
        System.out.println(name + "\t" + sound + " Он " + color + " цвета" + " ему " + age + " года (лет), его вес " + weight + " кг ");
    }
}

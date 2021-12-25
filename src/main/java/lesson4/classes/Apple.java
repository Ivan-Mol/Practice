package lesson4.classes;

public class Apple extends Fruit {
   private static String name ="яблоко";
   private static double weight = 1.0;

    public Apple() {
        super(name, weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Apple.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        Apple.weight = weight;
    }

    @Override
    public String toString() {
        return type;
    }
}

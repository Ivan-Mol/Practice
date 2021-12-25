package lesson4.classes;

public class Orange extends Fruit {
    private static String name ="апельсин";
    private static double weight = 1.5;

    public Orange() {
        super(name, weight);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return type;
    }
}

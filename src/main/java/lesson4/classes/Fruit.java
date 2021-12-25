package lesson4.classes;

public abstract class Fruit {
    protected String type;
    protected double weight;

    public Fruit(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }
}

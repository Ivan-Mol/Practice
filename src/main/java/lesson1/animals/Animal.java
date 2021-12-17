package lesson1.animals;

public abstract class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

}

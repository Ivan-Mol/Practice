package lesson1.animals;

public class Dog extends Animal {
    private static int count = 0;

    public Dog(String name) {
        super(name);
        count ++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance>500){
            System.out.println("Собака "+name+" не пробежит столько.");
        }
        else {
            System.out.println("Собака "+name+" пробежал "+distance+" метров.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance>10){
            System.out.println("Собака "+name+" не проплывет столько.");
        }
        else {
            System.out.println("Собака "+name+" проплыл "+distance+" метров.");
        }
    }
}

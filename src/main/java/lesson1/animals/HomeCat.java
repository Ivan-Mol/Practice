package lesson1.animals;

public class HomeCat extends Animal {
    private static int count = 0;

    public HomeCat(String name) {
        super(name);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance>200){
            System.out.println("Кот "+name+" не пробежит столько.");
        }
        else {
            System.out.println("Кот "+name+" пробежал "+distance+" метров.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот"+name+" не умеет плавать.");
    }
}

package lesson1.animals;

public class Tiger extends Animal {
    private static int count = 0;

    public Tiger(String name) {
        super(name);
        count++;
    }

    public static int getCount(){
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance>700){
            System.out.println("Тигр "+name+" не пробежит столько.");
        }
        else {
            System.out.println("Тигр "+name+" пробежал "+distance+" метров.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance>30){
            System.out.println("Тигр "+name+" не проплывет столько.");
        }
        else {
            System.out.println("Тигр "+name+" проплыл "+distance+" метров.");
        }
    }
}

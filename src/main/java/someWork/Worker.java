package someWork;

public abstract class Worker {
    protected String type;
    protected String name;
    protected int age;

    public abstract void doWork();
    public abstract void tellAbout();
    public abstract void goHome();

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

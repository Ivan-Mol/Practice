package someWork;

public class Teacher extends Worker {
    protected String spec;
    public Teacher(String name, int age, String spec) {
        super(name, age);
        this.type = "учитель";
        this.spec = spec;
    }

    @Override
    public void doWork() {
        System.out.println(type+" "+name+" преподает "+spec);
    }

    @Override
    public void tellAbout() {
        System.out.println(type+" "+ spec+" "+ name+" "+age);
    }

    @Override
    public void goHome() {
    }
}

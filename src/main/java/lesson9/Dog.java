package lesson9;

@Table(title = "Dogs")
public class Dog {
    @Column
    int id;
    @Column
    String name;
    @Column
    int age;

    public Dog(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

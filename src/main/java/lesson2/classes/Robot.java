package lesson2.classes;

public class Robot {
   protected String name;
   protected int maxRunningDistance;
   protected int maxJumpHeight;

    public Robot(String name, int maxRunningDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpHeight = maxJumpHeight;
    }
}

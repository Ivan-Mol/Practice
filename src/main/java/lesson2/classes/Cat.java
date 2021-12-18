package lesson2.classes;

import lesson2.interfaces.Running;

public class Cat implements Running {
   protected String name;
   protected int maxRunningDistance;
   protected int maxJumpHeight;

    public Cat(String name, int maxRunningDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run() {

    }
}

package lesson2.classes;

import lesson2.interfaces.Running;

public class Cat implements Running {
   protected String name;
   protected String type = "Кот";
   protected int maxRunningDistance;
   protected int maxJumpHeight;
   protected boolean Finished;

    public Cat(String name, int maxRunningDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run(Barrier barrier) {
        if (this.Finished==true){
            return;
        }
        if (barrier instanceof RunningTrack){
            if (maxRunningDistance>=((RunningTrack) barrier).getLenght()){
                System.out.println(type+" "+name+" успешно пробежал дистанцию "+((RunningTrack) barrier).getLenght());
            }
            else {
                System.out.println(type+" "+name+ " не финишировал на дистанции "+((RunningTrack) barrier).getLenght());
                Finished = true;
            }
        }
        if (barrier instanceof Wall){
            if (maxJumpHeight>=((Wall) barrier).getHeight()){
                System.out.println(type+" "+name+" успешно перепрыгнул стену высотой "+((Wall) barrier).getHeight());
            }
            else {
                System.out.println(type+" "+name+ " не смог перепрыгнуть стену высотой "+((Wall) barrier).getHeight());
                Finished = true;
            }
        }
    }
}

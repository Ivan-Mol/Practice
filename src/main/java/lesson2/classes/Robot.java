package lesson2.classes;

import lesson2.interfaces.Running;

public class Robot implements Running {
   protected String name;
   protected String type = "Робот";
   protected int maxRunningDistance;
   protected int maxJumpHeight;
   protected boolean Finished;

    public Robot(String name, int maxRunningDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
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

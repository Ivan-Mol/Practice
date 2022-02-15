package lesson7;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
    private Semaphore semaphore;
    public Tunnel () {
        this.semaphore = new Semaphore(MainApp.CARS_COUNT/2);
        this .length = 80 ;
        this .description = "Тоннель " + length + " метров" ;
    }
    @Override
    public void go (Car c) {
        try {
            if (!semaphore.tryAcquire()){
                System.out.println(c.getName() + " готовоится к этапу(ждет): " + description);
                semaphore.acquire();
            }
            System.out.println(c.getName()+ " начал этап: " + description);
            Thread.sleep(length/c.getSpeed()*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(c.getName()+" закончил этап: "+description);
            semaphore.release();
        }
    }
}

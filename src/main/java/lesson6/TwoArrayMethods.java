package lesson6;

import java.util.Arrays;

public class TwoArrayMethods {
    public static void firstMethod(){
        final int SIZE = 10000000;
        final int HALF = SIZE / 2 ;
        float [] array = new float [ SIZE ];

        Arrays.fill(array,1);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[ i ] = (float) (array[ i ] * Math.sin( 0.2f + i / 5) * Math.cos( 0.2f + i / 5) *
            Math . cos ( 0.4f + i / 2 ));
        }
        System.out.println("FirstMethod TimeMillis " + (System.currentTimeMillis() - startTime));
    }

    public static void secondMethod(){
        final int SIZE = 10000000;
        final int HALF = SIZE / 2 ;
        float [] array2 = new float [ SIZE ];
        Arrays.fill(array2,1);
        long startTime = System.currentTimeMillis();
        float[] partOneArray = Arrays.copyOfRange(array2,0,HALF);
        float[] partTwoArray = Arrays.copyOfRange(array2,HALF,array2.length);
        float[] finalArr = new float[partOneArray.length + partTwoArray.length];
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < partOneArray.length; i++) {
                    partOneArray[ i ] = (float) (partOneArray[ i ] * Math.sin( 0.2f + i / 5) * Math.cos( 0.2f + i / 5) *
                            Math . cos ( 0.4f + i / 2 ));
                }
                System.arraycopy(partOneArray, 0, finalArr, 0, partOneArray.length);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < partTwoArray.length; i++) {
                    for (int j = HALF; j < partTwoArray.length; j++) {
                        partTwoArray[ i ] = (float) (partTwoArray[ i ] * Math.sin( 0.2f + j / 5) * Math.cos( 0.2f + j / 5) *
                                Math . cos ( 0.4f + j / 2 ));
                    }
                }
                System.arraycopy(partTwoArray, 0, finalArr, partOneArray.length, partTwoArray.length);
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("SecondMethod TimeMillis " + (System.currentTimeMillis() - startTime));
    }

}

package org.example;

public class Synchronized {

    static int i = -1;
    public static void main(String[] args) {
        MeuRunnable runnable = new MeuRunnable();
        String name = Thread.currentThread().getName();
        System.out.println(name + " linha principal");
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    public static class MeuRunnable implements Runnable {
        @Override
        public synchronized void run(){
            for(int j = 0; j < 10000; j++, i++);
            String name = Thread.currentThread().getName();
            System.out.println(name + ':' + i);
        }
    }
}

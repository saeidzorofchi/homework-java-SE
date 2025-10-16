package org.example.multiThread;

public class Thread0to100 extends Thread {
    public void run() {

        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
        }
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getId() + 1000);
        System.out.println(currentThread.getName());
    }
}

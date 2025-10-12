package org.example.multiThread;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("First print on  Runnable");
        System.out.println("Second print on  Runnable");


    }
}

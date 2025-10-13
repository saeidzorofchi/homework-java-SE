package org.example.multiThread;

public class ThreadAtoZ implements Runnable{
    @Override
    public void run() {
        for (char c = 'A' ; c <= 'Z' ; c++){
            System.out.println(c);
        }
    }
}

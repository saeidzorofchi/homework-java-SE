package org.example.multiThread;

public class Thread0to100 extends Thread{
    public void run(){
        for (int i = 0 ; i <= 50 ; i++){
            System.out.println(i);
        }
    }
}

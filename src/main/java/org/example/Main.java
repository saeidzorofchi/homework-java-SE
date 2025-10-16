package org.example;


import org.example.multiThread.MyRunnable;
import org.example.multiThread.MyThread;
import org.example.multiThread.Thread0to100;
import org.example.multiThread.ThreadAtoZ;
import org.example.serialization.User;

import java.io.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println();


//////////////// START Serialization section block////////////////
        System.out.println("//////////////// START Serialization section block////////////////");
        System.out.println();
        {

            User user = new User("saeed", 30, 1234, "sdewrf");

// serialization obj user
            try {
                FileOutputStream fileOut = new FileOutputStream("user.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(user);
                out.close();
                fileOut.close();
                System.out.println("Ob j has been seri");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println();

// unserialization obj user

            try {
                FileInputStream fileIn = new FileInputStream("user.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                User user1 = (User) in.readObject();

                System.out.println("Obj has been deseri");
                System.out.println(user1.toString());

                in.close();
                fileIn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        System.out.println();
        System.out.println("//////////////// END Serialization section block ////////////////\n");
        System.out.println();
        System.out.println();
        System.out.println();
//////////////// END Serialization section block ////////////////


//////////////// START Thread section block ////////////////
        System.out.println("//////////////// START Thread section block ////////////////");
        System.out.println();
        {

            System.out.println("print on main method");
            MyThread thread1 = new MyThread();
            thread1.start();
            System.out.println();

            Thread thread2 = new Thread(new MyRunnable());
            thread2.start();
            System.out.println();
            System.out.println();


            


            Thread t1 = new Thread(new ThreadAtoZ());
            t1.start();
            t1.setPriority(7);
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getId() + 1000);
            System.out.println(currentThread.getName());
            new Thread0to100().start();
            new Thread(new ThreadAtoZ()).start();
            new Thread0to100().start();
            t1.join();

        }
        System.out.println();
        System.out.println("//////////////// END Thread section block ////////////////\n");
        System.out.println();
        System.out.println();
        System.out.println();
//////////////// END Thread section block ////////////////




//////////////// START Exception section block ////////////////
        System.out.println("//////////////// START Exception section block ////////////////");
        System.out.println();
        {
            // Checked Exception
            File file = new File("E:/Saeid Zorofchi - Java Developer.pdf");
            try {
                FileReader fileReader = new FileReader(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            // UnChecked Exception
            try {
                int a = 25;
                int b = 0;
                int c = a/b;
                System.out.println(c);
            }catch (Exception e){
                System.out.println("Error : "+ e.getMessage());
            }finally {
                System.out.println("The End");
            }





        }

    }
}

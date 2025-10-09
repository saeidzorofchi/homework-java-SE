package org.example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {



        System.out.println();
        System.out.println();

        User user = new User("saeed", 30);


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
        System.out.println();


// unserialization obj user

        try {
            FileInputStream fileIn = new FileInputStream("user.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            User user1 = (User) in.readObject();

            System.out.println("Obj has been deseri");
            System.out.println("Name : " + user1.getName());
            System.out.println("Age : " + user1.getAge());

            in.close();
            fileIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}

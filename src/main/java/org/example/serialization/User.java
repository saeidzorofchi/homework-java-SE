package org.example.serialization;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private int age;
    private transient int password;
    private transient String password2;

    public User(String name, int age, int password, String password2) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.password2 = password2;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPassword() {return password;}

    public String getPassword2() {return password2;}

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password=" + password +
                ", password2='" + password2 + '\'' +
                '}';
    }
}

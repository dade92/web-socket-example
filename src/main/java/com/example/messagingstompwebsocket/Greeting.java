package com.example.messagingstompwebsocket;

public class Greeting {

    private String name;
    private int age;

    public Greeting() {
    }

    public Greeting(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

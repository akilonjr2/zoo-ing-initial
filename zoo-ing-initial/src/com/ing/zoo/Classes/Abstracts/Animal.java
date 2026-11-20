package com.ing.zoo.Classes.Abstracts;

public abstract class Animal {
    public String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}

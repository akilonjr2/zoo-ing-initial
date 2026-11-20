package com.ing.zoo;

public class Hippo extends Animal implements Herbivore {
    public Hippo() {
        this("elsa");
    }

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("splash");
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch lovely");
    }
}

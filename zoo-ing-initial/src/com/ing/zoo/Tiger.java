package com.ing.zoo;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, TrickPerformer {
    private final Random random = new Random();

    public Tiger() {
        this("wally");
    }

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("rraaarww");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom oink wubalubadubdub");
    }

    @Override
    public void performTrick() {
        System.out.println(random.nextBoolean() ? "jumps in tree" : "scratches ears");
    }
}

package com.ing.zoo;

import java.util.Random;

public class Monkey extends Animal implements Herbivore, Carnivore, TrickPerformer {
    private final Random random = new Random();

    public Monkey() {
        this("milo");
    }

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("ooh ooh ah ah");
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch banana leaves");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom tasty");
    }

    @Override
    public void performTrick() {
        System.out.println(random.nextBoolean() ? "swings from a branch" : "juggles bananas");
    }
}

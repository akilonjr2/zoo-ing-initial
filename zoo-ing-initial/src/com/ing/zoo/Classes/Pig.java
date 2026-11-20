package com.ing.zoo.Classes;

import com.ing.zoo.Classes.Abstracts.Animal;
import com.ing.zoo.Interfaces.Carnivore;
import com.ing.zoo.Interfaces.Herbivore;
import com.ing.zoo.Interfaces.TrickPerformer;

import java.util.Random;

public class Pig extends Animal implements Herbivore, Carnivore, TrickPerformer {
    private final Random random = new Random();

    public Pig() {
        this("dora");
    }

    public Pig(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("splash");
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch oink");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom oink thx");
    }

    @Override
    public void performTrick() {
        System.out.println(random.nextBoolean() ? "rolls in the mud" : "runs in circles");
    }
}

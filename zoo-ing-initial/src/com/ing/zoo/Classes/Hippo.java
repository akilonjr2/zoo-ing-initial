package com.ing.zoo.Classes;

import com.ing.zoo.Classes.Abstracts.Animal;
import com.ing.zoo.Interfaces.Herbivore;

public class Hippo extends Animal implements Herbivore {
    public Hippo() {
        this("elsa");
    }

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("splash splash");
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch lovely");
    }
}

package com.ing.zoo.Classes;

import com.ing.zoo.Classes.Abstracts.Animal;
import com.ing.zoo.Interfaces.Herbivore;

public class Giraffe extends Animal implements Herbivore {
    public Giraffe() {
        this("george");
    }

    public Giraffe(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("giraffe hello");
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch from the treetop");
    }
}

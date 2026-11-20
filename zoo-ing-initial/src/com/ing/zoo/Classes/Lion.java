package com.ing.zoo.Classes;

import com.ing.zoo.Classes.Abstracts.Animal;
import com.ing.zoo.Interfaces.Carnivore;

public class Lion extends Animal implements Carnivore {
    public Lion() {
        this("henk");
    }

    public Lion(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("roooaoaaaaar");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom thx mate");
    }
}

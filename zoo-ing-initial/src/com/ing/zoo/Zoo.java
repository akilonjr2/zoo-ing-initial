package com.ing.zoo;

import com.ing.zoo.Classes.*;
import com.ing.zoo.Classes.Abstracts.Animal;
import com.ing.zoo.Interfaces.Carnivore;
import com.ing.zoo.Interfaces.Herbivore;
import com.ing.zoo.Interfaces.TrickPerformer;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Zoo {
    private final List<Animal> animals = Arrays.asList(
            new Lion(),
            new Hippo(),
            new Pig(),
            new Tiger(),
            new Zebra(),
            new Giraffe(),
            new Monkey()
    );

    public static void main(String[] args) {
        new Zoo().run();
    }

    private void run() {
        System.out.print("Voer uw command in: ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String command = scanner.nextLine().trim();
            if (command.isEmpty()) {
                continue;
            }
            if (command.equalsIgnoreCase("exit")) {
                return;
            }
            execute(command);
            System.out.print("Voer uw command in: ");
        }
    }

    void execute(String command) {
        String normalized = command.trim().toLowerCase(Locale.ENGLISH);
        if (normalized.equals("hello")) {
            animals.forEach(Animal::sayHello);
        } else if (normalized.startsWith("hello ")) {
            sayHelloTo(normalized.substring("hello ".length()).trim());
        } else if (normalized.equals("give leaves")) {
            animals.stream()
                    .filter(animal -> animal instanceof Herbivore)
                    .forEach(animal -> ((Herbivore) animal).eatLeaves());
        } else if (normalized.equals("give meat")) {
            animals.stream()
                    .filter(animal -> animal instanceof Carnivore)
                    .forEach(animal -> ((Carnivore) animal).eatMeat());
        } else if (normalized.equals("perform trick")) {
            animals.stream()
                    .filter(animal -> animal instanceof TrickPerformer)
                    .forEach(animal -> ((TrickPerformer) animal).performTrick());
        } else {
            System.out.println("Unknown command: " + command);
        }
    }

    private void sayHelloTo(String name) {
        for (Animal animal : animals) {
            if (animal.name.equalsIgnoreCase(name)) {
                animal.sayHello();
                return;
            }
        }
        System.out.println("Unknown animal: " + name);
    }
}

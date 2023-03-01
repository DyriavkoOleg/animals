package org.example;

public class Goat extends Animal implements Herbivore {

    public Goat(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Food food) {
        return Herbivore.super.canEat(food);
    }
}

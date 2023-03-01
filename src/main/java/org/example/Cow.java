package org.example;

public class Cow extends Animal implements Herbivore {

    public Cow(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Food food) {
        return Herbivore.super.canEat(food);
    }
}

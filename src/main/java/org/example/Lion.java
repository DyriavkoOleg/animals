package org.example;

public class Lion extends Animal implements Carnivore {

    public Lion(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Food food) {
        return Carnivore.super.canEat(food);
    }
}

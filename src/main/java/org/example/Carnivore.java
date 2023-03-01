package org.example;

public interface Carnivore extends Food {
    default boolean canEat(Food food) {
        return food instanceof Herbivore;
    }
}

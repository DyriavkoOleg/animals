package org.example;

public interface Herbivore extends Food {
    default boolean canEat(Food food) {
        return food instanceof Plant;
    }
}

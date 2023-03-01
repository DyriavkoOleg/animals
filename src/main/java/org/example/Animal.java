package org.example;

public abstract class Animal implements Food{
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract boolean canEat(Food food);

    public void eat(Food food) {
        if (canEat(food)) {
            System.out.println(this.getClass().getSimpleName() + " " + getName() + " ate " + food.getClass().getSimpleName());
        } else {
            System.out.println(this.getClass().getSimpleName() + " " + getName() + " cannot eat " + food.getClass().getSimpleName());
        }
    }
}

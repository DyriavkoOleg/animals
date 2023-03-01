package org.example;


public class App 
{
    public static void main( String[] args ) {

        Animal cow = new Cow("Betsy");
        Animal lion = new Lion("Simba");
        Animal goat = new Goat("Billy");
        Food grass = new Grass("Grass");

        System.out.println("\n------------COW------------");

        cow.eat(grass);
        cow.eat(goat);
        cow.eat(cow);
        cow.eat(lion);

        System.out.println("\n------------LION------------");

        lion.eat(goat);
        lion.eat(cow);
        lion.eat(grass);
        lion.eat(lion);

        System.out.println("\n------------GOAT------------");

        goat.eat(grass);
        goat.eat(goat);
        goat.eat(cow);
        goat.eat(lion);
    }
}

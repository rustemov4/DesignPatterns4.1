package com.company;

public class Archer extends Fighter implements Warrior{
    public Archer(String name, int level) {
        super(name, level);
    }

    @Override
    public void fight() {
        System.out.println("I am fighting with bow and arrow");
    }
}

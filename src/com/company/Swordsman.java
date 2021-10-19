package com.company;

public class Swordsman extends Fighter implements Warrior{
    public Swordsman(String name, int level) {
        super(name, level);
    }

    @Override
    public void fight() {
        System.out.println("I am fighting with swordbhyujmikn,lo .");
    }
}


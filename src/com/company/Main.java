package com.company;

public class Main {

    public static void main(String[] args) {
	    WarriorFactory warriorFactory = new WarriorFactory();
       Warrior warrior = warriorFactory.create("archer");
       warrior.fight();
    }
}

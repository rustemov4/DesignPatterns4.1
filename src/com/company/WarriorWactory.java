package com.company;
import java.util.Scanner;

class WarriorFactory implements AbstractsFactory<Warrior>{
    @Override
    public Warrior create(String warrior) {
        Scanner in = new Scanner(System.in);

        if(warrior.equalsIgnoreCase("ARCHER")){
            System.out.println("Input the nickname, waepon");
            String nickname = in.nextLine();
            int level = in.nextInt();
            return new Archer(nickname,level);
        }
        else if (warrior.equalsIgnoreCase("Swordsman")){
            System.out.println("Input the nickname, waepon");
            String nickname = in.nextLine();
            int level = in.nextInt();
            return new Swordsman(nickname,level);
        }
        return null;

    }
}

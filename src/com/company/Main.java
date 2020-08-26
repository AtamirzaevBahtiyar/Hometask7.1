package com.company;

public class Main {

    public static void main(String[] args) {

        Magic m =new Magic();
        m.setTypeOfSuperAbility("MAGICAL");
        Warrior w = new Warrior();
        w.setTypeOfSuperAbility("CRITICAL DAMAGE");
        Medic medic = new Medic();
        medic.setTypeOfSuperAbility("HEALING");


        Hero[] heroes = new Hero[]{m,w,medic};
        for (int i = 0; i < heroes.length ; i++) {

            heroes[i].applySuperAbility(heroes[i].getTypeOfSuperAbility());

        }

    }
}

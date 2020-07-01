package com.company;

public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Warrior Warrior = new Warrior();
        Medic medic = new Medic();

        Hero[] heroes = {magic,Warrior,medic};
        for (Hero hero:heroes) {
            hero.applySuperAbility(SuperAbility.CRITICAL_DAMAGE);
        }
	// write your code here
    }
}

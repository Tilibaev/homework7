package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility(SuperAbility superAbility) {
        System.out.println("warrior применил суперспособность + superAbilityType");
    }
}

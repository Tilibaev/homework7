package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbility(SuperAbility superAbility) {
        System.out.println("medic применил суперспособность + superAbilityType");
    }
}

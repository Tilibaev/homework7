package com.company;

public class Magic extends Hero{
    @Override
    public void applySuperAbility(SuperAbility superAbility) {
        System.out.println("magic применил суперспособность + superAbilityType");
    }
}

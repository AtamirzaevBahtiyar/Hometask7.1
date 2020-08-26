package com.company;

public abstract class  Hero implements HavingSuperAbility{
    private int health;
    private int damage;
    private String typeOfSuperAbility;

    public String getTypeOfSuperAbility() {
        return typeOfSuperAbility;
    }

    public void setTypeOfSuperAbility(String typeOfSuperAbility) {
        this.typeOfSuperAbility = typeOfSuperAbility;
    }
}

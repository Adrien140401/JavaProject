package com.company;


public class Archetype {



    public String name, type;
    protected int attack, health, initiative;

    public Archetype() {};

    public Archetype(String name)
    {
        name = name;
    }

    public void takeDamage(int damage)
    {
        health -= damage;
        if(health < 0) health = 0;
    }

    public int getAttack()
    {
        return attack;
    }
    public int getHealth()
    {
        return health;
    }
    public int getInitiative()
    {
        return initiative;
    }
    public String getName()
    {
        return name;
    }
    public String getType()
    {
        return type;
    }

    public void setAttack(int newAttack)
    {
        attack = newAttack;
    }
    public void setHealth(int newHealth)
    {
        health = newHealth;
    }
    public void setInitiative(int newInitiative)
    {
        initiative = newInitiative;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public void setType(String newType)
    {
        type = newType;
    }

    @Override
    public String toString()
    {
        return "Archetype {\n" +
                "\tname='" + name + "'\n" +
                "\ttype='" + type + "'\n" +
                "\tattack=" + attack +"\n"+
                "\thealth=" + health +"\n"+
                "\tinitiative=" + initiative +"\n"+
                '}';
    }
}
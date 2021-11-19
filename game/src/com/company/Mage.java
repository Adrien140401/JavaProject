package com.company;

public class Mage extends Archetype {
    private double magicDamage;


    public Mage()
    {
        this("", "",20,70,20,20);
    }

    public Mage(String name)
    {
        this(name, "",20,70,20,20);
    }

    public Mage(String name,String type,int Attack,int health,int initiative, int magicDamage)
    {
        magicDamage = magicDamage;
        if(name.equals("")) this.setName("Mage");
        else this.setName(name);
        this.setType("Mage");
        this.setHealth(80);
        this.setInitiative(10);
        this.setAttack(10);
    }

    public int getTotalDamageOnTurn()
    {
        int damage = (int) (magicDamage *0.5 + this.getAttack());

        return damage;
    }

    public double getMagicDamage()
    {
        return magicDamage;
    }

    public void setMagicDamage(double newMagicDamage)
    {
        magicDamage = newMagicDamage;
    }


    @Override
    public String toString() {
        return "Mage{" +
                " name='" + getName() +
        ", type='" + getType() +
        ", attack=" + getAttack() +
                ", health=" + getHealth() +
                ", initiative=" + getInitiative() +
                ", magicDamage=" + magicDamage +
                '}';
    }
}

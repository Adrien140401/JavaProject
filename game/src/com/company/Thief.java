package com.company;
import java.lang.Math;

public class Thief extends Archetype {
    private double dodge, critRate;
    private int critDamage;


    public Thief()
    {
        this("", "", 30,80,30,5,5);
    }

    public Thief(String name)
    {
        this(name, "", 30,80,30,5,5);
    }

    public Thief(String name,String type,int attack,int health,int initiative, double dodge, double critRate)
    {
        dodge = dodge;
        critRate = critRate;
        critDamage = 2;

        if(name.equals("")) this.setName("Thief");
        else this.setName(name);
        this.setType("Thief");
        this.setHealth(health);
        this.setInitiative(initiative);
        this.setAttack(attack);
    }




    public double getDodge()
    {
        return dodge;
    }

    public void setDodge()
    {

    }

    public double getCriRate()
    {
        return critRate;
    }

    public void setCritRate(double newCritRate)
    {
        critRate = newCritRate;
    }


    public void critDamage(){
        Math.random();
        if(Math.random() < critRate && Math.random() > 0){



        }
    }

    public double getCritDamage()
    {
        return critDamage;
    }

    public void setCritDamage(int newCritDamage)
    {
        critDamage = newCritDamage;
    }

    @Override
    public String toString() {
        return "Thief{" +
                "name='" + getName() +
        ", type='" + getType() +
        ", attack=" + getAttack() +
                ", health=" + getHealth() +
                ", initiative=" + getInitiative() +
                ", dodge=" + dodge +
                ", critRate=" + critRate +
                ", critDamage=" + critDamage +
                '}';
    }
}

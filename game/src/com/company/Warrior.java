package com.company;

public class Warrior extends Archetype
{
    private int Shield;

    public Warrior()
    {
        this("Warrior","Warrior",20,150,20,20);

    }

    //public Warrior(String name)
    // {
    //  this(name, 20);
    //}

    public Warrior(String name,String type,int Attack,int health,int initiative, int shieldStrength)
    {
        Shield = shieldStrength;
        if(name.equals("")) this.setName("Warrior");
        else this.setName(name);
        this.setType("Warrior");
        this.setHealth(130);
        this.setInitiative(15);
        this.setAttack(30);
    }
    public void takeDamage(int damage){

        System.out.println("Guerrier a parry "+ Shield + " damage");
        health -= blockAttack(damage);

    }

    public int blockAttack(int damage)
    {
        return damage - Shield;
    }

    public int getShieldStrength()
    {
        return Shield;
    }

    public void setShieldStrength(int newShield)
    {
        newShield = Shield;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + getName() +
        ", type='" +getType() +
        ", attack=" + getAttack() +
                ", health=" + getHealth() +
                ", initiative=" + getInitiative() +
                ", shieldStrength=" + Shield +
                '}';
    }
}


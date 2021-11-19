package com.company;

public class Player{

    String name;
    int attack;
    int health;
    int init;


    public Player(String name, int attack, int health, int init) {
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.init = init;
    }

    //Attack

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    //Health

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    //Initiative

    public int getInit() {
        return init;
    }

    public void setInit(int init) {
        this.init = init;
    }

    //Name

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Damage

    public void damage(int damage){

        this.health -= damage;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", health=" + health +
                ", init=" + init +
                '}';
    }

}

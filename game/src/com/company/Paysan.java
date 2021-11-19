package com.company;

import com.company.Archetype;

public class Paysan extends Archetype {
    public Paysan(String name)
    {
        if(name.equals("")) this.setName("Paysan");
        else this.setName(name);
        this.setType("Paysan");
        this.setHealth(50);
        this.setInitiative(0);
        this.setAttack(5);
    }
}
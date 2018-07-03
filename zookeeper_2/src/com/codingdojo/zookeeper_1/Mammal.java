package com.codingdojo.zookeeper_1;

public class Mammal {
	public int energyLevel = 100;
    public int displayEnergy() {
        System.out.println("Energy level is: "+energyLevel);
        return energyLevel;
    }
}
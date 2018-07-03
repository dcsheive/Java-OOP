package com.codingdojo.zookeeper_1;

public class Gorilla extends Mammal{
    public void throwSomething(){
        energyLevel -=5;
        System.out.println("Threw something! Lost 5 energy.");
    }
    public void eatBananas() {
        energyLevel += 10;
        System.out.println("Ate bananas! Gained 10 energy.");

    }
    public void climb() {
        energyLevel -= 10;
        System.out.println("Climbed! Lost 10 energy.");

    }
}
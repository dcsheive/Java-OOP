package com.codingdojo.zookeeper_1;

public class Bat extends Mammal{
	public Bat() {		
		this.energyLevel = 300;
	}
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("Flew! Lost 50 energy!");
	}
	public void eatHuman() {
		this.energyLevel += 25;
		System.out.println("Ate human! Gained 25 energy!");
	}
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("Attacked the town! Lost 100 energy!");
	}
}

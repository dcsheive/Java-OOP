package com.codingdojo.object_master_1;

public class Samurai extends Human{
	private static int count;
	public Samurai () {
		this.health = 200;
		this.count += 1;
	}
	public Samurai (int health) {
		this.health = health;
		this.count +=1;
	}
	public void deathBlow(Human victim) {
		victim.health = 0;
		this.health /= 2;
	}
	public void meditate() {
		this.health *= 1.5;
	}
	public void howMany() {
		System.out.println("There are "+this.count+" Samurai");
	}
}

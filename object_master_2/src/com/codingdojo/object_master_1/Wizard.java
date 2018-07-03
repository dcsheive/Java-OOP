package com.codingdojo.object_master_1;

public class Wizard extends Human{
	public Wizard() {
		this.intelligence = 8;
		this.health = 50;
	}
	public Wizard(int intel) {
		this.intelligence = intel;
		this.health = 50;
	}
	public void heal(Human victim) {
		victim.health += this.intelligence;
	}
	public void fireball(Human victim) {
		victim.health -= this.intelligence *3;
	}
}

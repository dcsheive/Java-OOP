package com.codingdojo.object_master_1;

public class Human {
	int stealth;
	int strength;
	int intelligence;
	int health;
	public Human() {
		this.stealth = 3;
		this.strength = 3;
		this.intelligence = 3;
		this.health = 100;	
	}
	public Human(int stealth) {
		this.stealth = stealth;
		this.strength = 3;
		this.intelligence = 3;
		this.health = 100;	
	}
	public Human(int stealth, int strength) {
		this.stealth = stealth;
		this.strength = strength;
		this.intelligence = 3;
		this.health = 100;	
	}
	public Human(int stealth, int strength, int intelligence) {
		this.stealth = stealth;
		this.strength = strength;
		this.intelligence = intelligence;
		this.health = 100;	
	}
	public void display() {
		System.out.println("Stealth: "+this.stealth+" Strength: "+this.strength);
		System.out.println("Intelligence: "+ this.intelligence+" Health: "+ this.health);
	}
	public void attack(Human victim) {
		victim.health -= this.strength;
	}
}

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
	public Human(int strength) {
		this.strength = 3;
		this.stealth = strength;
		this.intelligence = 3;
		this.health = 100;	
	}
	public Human(int strength, int stealth) {
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = 3;
		this.health = 100;	
	}
	public Human( int strength,int stealth, int intelligence) {
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = 100;	
	}
	public void display() {
		System.out.println("Strength: "+this.strength+" Stealth: "+this.stealth);
		System.out.println("Intelligence: "+ this.intelligence+" Health: "+ this.health);
	}
	public void attack(Human victim) {
		victim.health -= this.strength;
	}
}

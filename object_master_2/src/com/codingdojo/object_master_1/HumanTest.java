package com.codingdojo.object_master_1;

public class HumanTest {

	public static void main(String[] args) {
		Human bob = new Human(3, 5, 6);
		Human billy = new Human();
		bob.attack(billy);
		billy.display();
		Ninja tony = new Ninja();
		tony.runAway();
		tony.steal(billy);
		billy.display();
		Samurai bo = new Samurai();
		Samurai co = new Samurai();
		co.howMany();
		bo.deathBlow(bob);
		bo.display();
		bo.meditate();
		bo.display();
		Wizard mo = new Wizard();
		mo.heal(bob);
		bob.display();
		mo.fireball(billy);
		billy.display();
	}

}

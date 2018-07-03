package com.codingdojo.object_master_1;

public class HumanTest {

	public static void main(String[] args) {
		Human bob = new Human(3, 5, 6);
		Human billy = new Human();
		bob.attack(billy);
		billy.display();

	}

}

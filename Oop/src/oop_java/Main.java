package oop_java;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.catRun();
		cat.catJump();
		System.out.println();
		
		Human human = new Human();
		human.humanRun();
		human.humanJump();
		System.out.println();
		
		Robot robot = new Robot();
		robot.robotRun();
		robot.robotJump();
	}

}

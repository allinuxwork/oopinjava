package oop_java;

public class Human {
	private String name = "Человек";
	private int jump = 5;
	private int run = 3000;

	public Human() {
	}

	public Human(String name, int jump, int run) {
		this.name = name;
		this.jump = jump;
		this.run = run;
	}

	public void humanJump() {
		System.out.println(name + " прыгает на " + jump+" метров");
	}

	public void humanRun() {
		System.out.println(name + " бегает на " + run + " метров");
	}
}

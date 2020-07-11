package oop_java;

public class Cat {
	private String name = "Кот";
	private int jump = 15;
	private int run = 800;

	public Cat() {
	}

	public Cat(String name, int jump, int run) {
		this.name = name;
		this.jump = jump;
		this.run = run;
	}

	public void catJump() {
		System.out.println(name + " прыгает на " + jump +" метров");
	}

	public void catRun() {
		System.out.println(name + " бегает на " + run + " метров");
	}

}

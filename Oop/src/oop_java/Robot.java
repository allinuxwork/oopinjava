package oop_java;

public class Robot {
	private String name = "Робот";
	private int jump = 50;
	private int run = 30000;

	public Robot() {
	}

	public Robot(String name, int jump, int run) {
		this.name = name;
		this.jump = jump;
		this.run = run;
	}

	public void robotJump() {
		System.out.println(name + " прыгает на " + jump+" метров");
	}

	public void robotRun() {
		System.out.println(name + " бегает на " + run + " метров");
	}
}

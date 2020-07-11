package oop_java2;

public class Treadmill extends Player {

	public Treadmill(int run) {
		this.run = run;
	}

	void runPlayer() {
		if (run >= 900) {
			System.out.println("Участник успешно пробежал");
		} else {
			System.out.println("Участник не смог пробежать");
		}
	}

}

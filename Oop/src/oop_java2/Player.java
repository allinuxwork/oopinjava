package oop_java2;

public abstract class Player {
 int jump, run;

public Player() {
}

public Player(int jump, int run) {
	this.jump = jump;
	this.run = run;
}
void jumpPlayer() {
    System.out.println("Участник прыгнул");
}
	
void runPlayer() {
    System.out.println("Участник пробежал");
}

}

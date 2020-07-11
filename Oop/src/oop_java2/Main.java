package oop_java2;

public class Main {

	public static void main(String[] args) {
		Treadmill treadmill = new Treadmill(900);
		treadmill.runPlayer();
		System.out.println();
		
		Wall wall = new Wall(10);
		wall.jumpPlayer();
	}

}

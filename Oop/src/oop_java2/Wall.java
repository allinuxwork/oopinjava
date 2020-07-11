package oop_java2;

public class Wall extends Player {

	public Wall (int jump) {
        this.jump = jump;
    }
	
	void jumpPlayer() {
		 if (jump >= 10) {
			 System.out.println("Участник успешно подпрыгнул");
	     } else {
	         System.out.println("Участник не смог подпрыгнуть");
	     }
	}

}

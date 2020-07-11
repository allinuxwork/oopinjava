package oop_java3;

public class Players {
	int[] volume;
	int[] barrier;
	
	public Players(int[] volume, int[] barrier) {
		super();
		this.volume = volume;
		this.barrier=barrier;
	}
	


	public void putMeInArray(int[] barrier, int[] volume) {
        for (int i = 0; i < volume.length; i++) {
        	for (int j = 0; j < barrier.length; j++) {
				System.out.println(barrier[j] + volume[i]);
			}		
		}
    }
}

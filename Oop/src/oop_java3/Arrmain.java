package oop_java3;

public class Arrmain {

	public static void main(String[] args) {
		int[] volume = new int[10];
		int[] barrier = new int[4];
		passSetBarrier(barrier, volume);

	}
	private static void passSetBarrier(int[] volume, int[] barrier) {
		for (int i = 0; i < volume.length; i++) {
			for (int j = 0; j < barrier.length; j++) {
				volume[i] = i;
				barrier[j] = j;
				System.out.println("" + barrier[j] + "--" + volume[i]);
			}
		}
	}

}

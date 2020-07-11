package oop_java4;

import java.util.Arrays;

public class Limithurdle {

	public static void main(String[] args) {
		int[] volume = new int[4];
		String[] v = new String[4];
		int a = 0, b = 1, c = 7, d = 3;
		int[] arr = { a, b, c, d };
		for (int i = 0; i < volume.length; i++) {
			System.out.println("-------");
			for (int j = 0; j < arr.length; j++) {
				volume[i] = i;
				if (arr[j] > 6) {
					System.out.println("Препятствие слишком высокое");
					break;
				}
				System.out.println("" + volume[i] + "--" + arr[j]);
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(v));
	}

}

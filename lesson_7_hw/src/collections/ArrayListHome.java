package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHome {

	public static void main(String[] args) {
		System.out.println("------------------------------------------------");
		ArrayList<String> arrayListHome = new ArrayList<>();
		ArrayList<String> arrayListUnique = new ArrayList<>();
		arrayListHome.add("Арбуз");
		arrayListHome.add("Банан");
		arrayListHome.add("Арбуз");
		arrayListHome.add("Батон");
		arrayListHome.add("Шоколад");
		arrayListHome.add("Карамель");
		arrayListHome.add("Торт");
		arrayListHome.add("Лимонад");
		arrayListHome.add("Квас");
		arrayListHome.add("Лук");
		arrayListHome.add(10, "Xалва");
		System.out.println(arrayListHome);
		System.out
			.println("-----------------------------------------------------");
		System.out.println("Подсчитываем сколько раз встречается каждое слово");
		for (String value : arrayListHome) {
			System.out.print(Collections.frequency(arrayListHome, value));
			if ((Collections.frequency(arrayListHome, value)) == 1) {
				arrayListUnique.add(value);
			}
			System.out.println("\t" + value);
		}
		System.out.println(
			"------------------------------------------------------------");
		System.out.println("Список уникальных слов");
		System.out.println(arrayListUnique);
	}
}

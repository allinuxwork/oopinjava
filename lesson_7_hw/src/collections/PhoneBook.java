package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

	private HashMap<String, List<String>> book;
	public PhoneBook() {
		this.book = new HashMap<>();
	}

	public void add(String surname, String phone) {
		if (book.containsKey(surname)) {
			List<String> phones = book.get(surname);
			if (!phones.contains(phone)) {
				phones.add(phone);
				System.out.println(String.format("Номер телефона %s фамилия %s",
					phone, surname));
			} else {
				System.out.println(String.format(
					"Номер %s уже существует для фамилии %s", phone, surname));
			}
		} else {
			book.put(surname, new ArrayList<>(Arrays.asList(phone)));
			System.out.println(
				String.format("Номер телефона %s фамилия %s", phone, surname));
		}
	}

	public void get(String surname) {
		if (book.containsKey(surname))
			//return book.get(surname);
			System.out.println(surname + "---"+ book.get(surname));
		else {
		 System.out.printf("В справочнике нет телефона для фамилии %s\n", surname);
		}
	}
	
	@Override
	public String toString() {
		return "Весь телефоный справочник " + book;
	}
	
}

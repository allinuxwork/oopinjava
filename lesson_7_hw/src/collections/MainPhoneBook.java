package collections;

public class MainPhoneBook {

	public static void main(String[] args) {
		System.out.println("Телефоный справочник");
		PhoneBook phonebook = new PhoneBook();
		System.out.println("-----------------------------------------------");

		System.out.println("Заносим в справочник фамилии и номера телефонов");
		phonebook.add("Антонова", "89270643051");
		phonebook.add("Семенов", "89378744510");
		phonebook.add("Антонова", "89372334499");
		phonebook.add("Сверидов", "89372233488");
		phonebook.add("Малкина", "89172233442");
		phonebook.add("Cелина", "89172233440");
		System.out.println("-----------------------------------------------");

		System.out.println("Получить номер телефона Антоновой");
		phonebook.get("Антонова");
		System.out.println("Получить номер телефона Семенова");
		phonebook.get("Семенов");
		System.out.println("Получить номер телефона Герасимова");
		phonebook.get("Герасимов");
		System.out.println("----------------------------------------------");

		System.out.println("Запишем номер с уже существующей фамилией");
		phonebook.add("Антонова", "89276314551");
		phonebook.get("Антонова");

		System.out.println(phonebook);
		
	}
}

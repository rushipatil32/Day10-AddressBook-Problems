package com.addressbook.problems;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Welcome in Address Book Program");
		HashMap<String, AddressBook> list = new HashMap<String, AddressBook>();

		AddressBook familyAddressBook = new AddressBook();
		AddressBook friendsAddressBook = new AddressBook();
		AddressBook relativesAddressBook = new AddressBook();

		list.put("Family", familyAddressBook);
		list.put("Friends", friendsAddressBook);
		list.put("Relatives", familyAddressBook);

		while (true) {
			System.out.println("1: Family Address Book \n" + "2: Friend Address Book \n"
					+ "3: Relatives Address Book \n" + "4: Terminate the program");
			Scanner scanner = new Scanner(System.in);
			int selectedOption = scanner.nextInt();
			if (selectedOption == 1) {
				familyAddressBook.getUserChoice();
			} else if (selectedOption == 2) {
				friendsAddressBook.getUserChoice();
			} else if (selectedOption == 3) {
				break;
			}
		}
	}
}

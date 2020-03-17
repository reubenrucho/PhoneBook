package phoneBook;

import java.io.IOException;
import java.util.Scanner;

public class PhoneBook 
{
	//		Test case :
	//		John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
	//		John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
	//		John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375

	public static void main(String[] args) 
	{
		main();
	}
	public static void addContact() 
	{	
		try { 	
			System.out.println("Ex: John Doe, 114 Market St, St Louis, MO, 63403, 6366435698");
			System.out.println("Enter info: fName lName, street, city, state, zip, cell");
			Scanner input = new Scanner(System.in);
			String[] a = input.nextLine().split(", ");

			String names = a[0];
			String street = a[1];
			String city = a[2];
			String state = a[3];
			String zipCode = a[4];
			String cell = a[5];	

			String [] wholename = names.split(" ");
			String firstName = wholename[0];
			String lastName = wholename[wholename.length-1];

			Address address = new Address(street, city, state, zipCode);
			Person person = new Person(firstName, lastName, address, cell);

			add(person);
			System.out.println(person.toString());

		} 
		catch (Exception e) { 
			System.out.println("uh you broke it"); 
		} 
	}
	public static int currentEntry = 0;
	public static int currentInt = 3;
	public static Person [] people = new Person[currentInt];

	public static Person [] add (Person person) {
		people[currentEntry]= person;
		currentEntry++;
		return people;	
	}
	public static void Delete() throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter cell:\n");
		String first = in.nextLine();

		for (Person person : people) {
			if (person.getCell().equals(first)) {
				for (int i = 0; i < people.length; i++) {
					if (people[i] == person) {
						for (int j = i; j < people.length - 1; j++) {
							people[j] = people[j+1 ];
						}
					}
				}
				System.out.println("Deleted " + person.getFirstName() + " " + person.getLastName() + ".");
				break;
			}
		}

	}
	public static void displayAll() {

		for(Person people : people ) {

			System.out.println(people);
		}
	}
	public static void search() {
		System.out.println("search entries");
		Scanner sc = new Scanner(System.in);
		String search = sc.nextLine()	;

		for(Person person : people) {

			try {	

				if(search.equals(person.getClass().toString()) ) {

					System.out.println(person);

				}else System.out.println("didnt work"); {
					break;
				}
			}catch(NullPointerException e) {

				System.out.println("Recalculating!");
			}
		}
	}

	public static void searchFName() {

		System.out.println("search FirstName");
		Scanner sc = new Scanner(System.in);
		String fNameInput = sc.nextLine()	;

		for(Person person : people) {

			try {	

				if(fNameInput.equals(person.getFirstName())) {

					System.out.println(person);

				}else System.out.println("we no hav dat!"); {
					break;
				}
			}catch(NullPointerException e) {

				System.out.println("we no hav dat!");
			}
		}
	}
	public static void searchLName() {

		System.out.println("search LastName");
		Scanner sc = new Scanner(System.in);
		String LNameInput = sc.nextLine()	;

		for(Person person : people) {

			try {	

				if(LNameInput.equals(person.getLastName())) {

					System.out.println(person);

				}else System.out.println("we aint got it!"); {
					break;
				}
			}catch(NullPointerException e) {

				System.out.println("we no hav dat!");
			}
		}
	}
	public static void searchFullName() {

		System.out.println("search FullName");
		Scanner sc = new Scanner(System.in);
		String FullName = sc.nextLine()	;

		for(Person person : people) {

			try {	

				if(FullName.equals(person.getFirstName() +" "+ person.getLastName() )) {

					System.out.println(person);

				}else System.out.println("we aint got it!"); {
					break;
				}
			}catch(NullPointerException e) {

				System.out.println("we no hav dat!");
			}
		}
	}
	public static void searchCell() {
		System.out.println("search cell");
		Scanner sc = new Scanner(System.in);
		String cell = sc.nextLine()	;

		for(Person person : people) {

			try {	

				if(cell.equals(person.getCell())) {

					System.out.println(person);

				}else System.out.println("ring ring dis aint it!"); {
					break;
				}
			}catch(NullPointerException e) {

				System.out.println("we no hav dat!");
			}
		}
	}
	public static void searchCityState() {
		System.out.println("search city/state");
		Scanner sc = new Scanner(System.in);
		String cityState = sc.nextLine()	;

		for(Person people : people) {

			try {	

				if(cityState.equals(people.getCity()) ) {

					System.out.println(people);

								
				}else System.out.println("wrong city/state bud"); {
					break;
				}
			}catch(NullPointerException e) {

				System.out.println("Recalculating!");
			}
		}
	}
	public static void main() {

		System.out.println("Enter # 1-10");
		System.out.println("0.Add contact");
		System.out.println("1.Search existing");
		System.out.println("2.Search by firstname");
		System.out.println("3.Search by lastname");
		System.out.println("4.Search by fullname");
		System.out.println("5.Search by cell");
		System.out.println("6.Search by city/state");
		System.out.println("7.Delete contact");
		System.out.println("8.Update contact");
		System.out.println("9.Display");
		System.out.println("10.Exit");

		Scanner sc2 = new Scanner(System.in);
		int input = sc2.nextInt();

		switch (input) {
		case 0:
			addContact();

			main();
			break ;
		case 1:
			search();
			main(); ;
			break;
		case 2: 
			searchFName();
			main(); ;
			break;
		case 3:
			searchLName();
			main(); ;
			break;
		case 4:
			searchFullName();
			main(); ;
			break;
		case 5:
			searchCell();
			main(); ;
			break;
		case 6:
			searchCityState();
			main(); ;
			break;
		case 7:
			displayAll();
			try {
				Delete();
			} catch (IOException e) {
				System.out.println("BYE!");				
			}
			main(); ;
			break;
		case 8:
			displayAll();
			try {
				Delete();
			} catch (IOException e) {
				System.out.println("BYE!");	
				}
			addContact();
			main(); ;
		case 9:
			System.out.println("Display ");
			displayAll();
			main(); ;
			break;
		default: 
			System.out.println("SAYONARA!");
			System.exit(input); ;
		}
	}
}

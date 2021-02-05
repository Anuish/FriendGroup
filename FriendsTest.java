package Assignment9;

/*Name: Modupeoluwa Oluwatayo.
 */
public class FriendsTest {

	public static void main(String[] args) {
		Friends f = new Friends();
		Person p1 = new Person("Joe", "Bloggs");
		f.add(p1);
		f.add(new Person("Rosella", "Murphy"));
		f.add(new Person("Mary", "O Keefe"));
		f.display();
		System.out.println();
		Person notThere = new Person("JJ", "Byrne");
		System.out.printf("Person %s should not be there, so false: %b\n",
													notThere.toString(),f.search(notThere));
		System.out.printf("Person %s should  be there, so true: %b\n",p1.toString(),f.search(p1));

		System.out.println();
		System.out.printf("There should be 3 friends: %d\n",f.size());

		System.out.println();
		f.add(new Person("Rosella", "O Keefe"));
		System.out.printf("There should be 2 people with the surname 'O Keefe: %s",
													f.getSurname("O Keefe").toString());
		System.out.println();

		System.out.println();
		f.add(new Person("Rosella", "O Keefe"));
		System.out.printf("There should be 2 people with the firstname 'Rosella': %s\n",
													f.getFirstname("Rosella").toString());
		System.out.println();
		System.out.printf("There should be 1 person called 'Joe': %d\n",f.getFreq("Joe"));
		f.add(new Person("Joe", "Bloggs"));
		System.out.printf("There should still be 1 person called 'Joe': %d\n",f.getFreq("Joe")); // unique
		f.add(new Person("Joe", "BloggsEile"));
		System.out.printf("There should be 2 people called 'Joe': %d\n",f.getFreq("Joe"));
		System.out.println();
		f.display();
		System.out.printf("Jow Bloggs should be removed (4 people): ");
		f.del(p1);
		f.display();

		System.out.println();
		System.out.printf("Sorted list of friends: %s\n",f.sort().toString());
 

	}

}

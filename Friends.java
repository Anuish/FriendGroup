package Assignment9;
/*Name: Modupeoluwa Oluwatayo.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
 
public class Friends {
	//declaration of fields
	private HashSet<Person> personSet;
	private int size;
	
	Friends(){
		//friends constructor for initializing fields
		personSet = new HashSet<Person>();
		size = 0;
	}
	
	public boolean add(Person p) {
		/* Description: add method used to add people to a set.
		 * 
		 * @param p: the value of the type Person to be assigned to be added to a set. 
		 *  
		 * 
		 * @return: returns an boolean value
		 */
		if(search(p) != true) {
			personSet.add(new Person(p.fName(), p.sName()));
			size++;
			return true;
		}
		else {
			return false;
		}
		
	}
	public boolean search(Person p) {
		/* Description: search method used to add people to a set.
		 * 
		 * @param p: the value of the type Person to be searched in a set. 
		 *  
		 * @return: returns an boolean value
		 */
		for(Person person : personSet) {
			if(person.equals(p)) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		//returns the size of the set
		return size;
	}
	public HashSet<Person> getSurname(String s){
		/* Description: getSurname method used to search for a surname in a set.
		 * 
		 * @param s: the value of the type String to be search. 
		 *  
		 * 
		 * @return: returns a set.
		 */
		HashSet<Person> surnameSet = new HashSet<Person>();
		for(Person p : personSet) {
			if(p.sName().equals(s)) {
				surnameSet.add(new Person(p.fName(), p.sName()));
			}
		}
		return surnameSet;
	}
	public HashSet<Person> getFirstname(String f){
		/* Description: getFirstname method used to search for a firstname in a set.
		 * 
		 * @param f: the value of the type String to be search. 
		 *  
		 * @return: returns a set.
		 */
		HashSet<Person> firstnameSet = new HashSet<Person>();
		for(Person p : personSet) {
			if(p.fName().equals(f)) {
				firstnameSet.add(new Person(p.fName(), p.sName()));
			}
		}
		return firstnameSet;
	}
	public int getFreq(String f) {
		/* Description: getFreq method used to get the number of firstnames in a set.
		 * 
		 * @param f: the value of the type String to get the frequency. 
		 *  
		 * @return: returns an integer.
		 */
		int freq = 0;
		for(Person p : personSet) {
			if(p.fName().equals(f)) {
				freq++;
			}
		}
		return freq;
	}
	public boolean del(Person p) {
		/* Description: getFreq method used to get the number of firstnames in a set.
		 * 
		 * @param f: the value of the type String to get the frequency. 
		 *  
		 * @return: returns an integer.
		 */
		if(search(p) == true) {
			personSet.remove(p);
			return true;
		}
		return false;
	}
	public ArrayList<Person> sort(){
		/* Description: sort method used to sort the set.
		 *  
		 * @return: returns a list.
		 */
		ArrayList<Person> sortedPerson = new ArrayList<Person>(personSet);
		Collections.sort(sortedPerson);
		return sortedPerson;
	}
	public void display() {
		//output representation.
		System.out.println(personSet);
	}
	
	

}

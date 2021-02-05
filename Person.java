package Assignment9;
/*Name: Modupeoluwa Oluwatayo.
 *Student number: 3006354
 */

final class Person implements Comparable<Person>{
	private final String sName;
    private final String fName;
	Person(String fn, String sn){fName = fn; sName = sn;}
	public String sName(){return sName;}
    public String fName(){return fName;}
	public String toString(){return fName+" "+sName;}
	public boolean equals(Object ob){
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return sName.equals(p.sName) && fName.equals(p.fName);
 	}
	public int compareTo(Person p){
		if(p == null) return -1;
		if(this.equals(p)) {
			return  0;
		}
		else if(!(this.equals(p))) {
        	return sName.compareTo(p.sName);//compares the surname first
        }
        else {
        	return fName.compareTo(p.fName);//compares the firstname
        }
		
	}
	public int hashCode(){
       return 41 * sName.hashCode() * fName.hashCode();
    }
}




package first

class AccessList {
	String firstName;
	String lastName;
	AccessList(String firstName, String lastName){
			this.firstName = firstName
			this.lastName= lastName
	}
	
	public static void main(args){
		List<AccessList> persons = new ArrayList()
		persons[0] = new AccessList("Jim", "Knopf")
		persons[1] = new AccessList("Test", "Test")
				
		println persons.size()
		println persons.firstName
		println persons.lastName
}


}

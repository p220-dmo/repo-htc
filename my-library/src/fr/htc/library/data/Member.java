package fr.htc.library.data;

public class Member {
	private static int matSeq = 100;
	private String matricule;
	private String firstName;
	private String lastName;
	private int age;

	// **** constructors
	public Member() {

	}

	public Member(String firstName, String lastName, int age) {
		this(firstName, lastName);
		this.age = age;
	}

	public Member(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.matricule = this.generateMatricule();
	}


	private String generateMatricule() {
		String matricule = this.firstName
				.substring(0, 1)
				.toUpperCase() 
		+ this.lastName.substring(0, 1).toUpperCase() + matSeq++;
		
		return matricule;
	}

	// **** getters and setters

	public String getMatricule() {
		String matricule = lastName.toUpperCase().substring(0, 1) 
				+firstName.toUpperCase().substring(0, 1) 
				+matSeq++;
		return matricule;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [matricule=" + matricule + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}
	
	

}

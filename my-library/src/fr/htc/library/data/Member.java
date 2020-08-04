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
		this.matricule = this.generateMatricule();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	private String generateMatricule() {
		return null;
	}

	// **** getters and setters

	public String getMatricule() {
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

}

package fr.htc.heritage.person;

public class Personne {
	String nom;
	int anneeNaissance;

	public int age() {
		return 2008 - anneeNaissance;
	}
}
